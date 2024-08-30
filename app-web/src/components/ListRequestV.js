import React, { useEffect, useState } from 'react';
import axios from 'axios';
import './ ListRequestV.css';

const ListRequestV = () => {
    const [data, setData] = useState([]);
    const [error, setError] = useState(null);
    const [modalIsOpen, setModalIsOpen] = useState(false);
    const [currentImage, setCurrentImage] = useState('');
    useEffect(() => {
        const fetchData = async () => {
            try {
                const response = await axios.get('http://localhost:8080/myproject/listRequested');
                setData(response.data);
            } catch (error) {
                setError('Error fetching data');
                console.error('Error fetching data:', error);
            }
        };

        fetchData();
    }, []);
    const openModal = (imageUrl) => {
        setCurrentImage(imageUrl);
        setModalIsOpen(true);
    };

    const closeModal = () => {
        setModalIsOpen(false);
        setCurrentImage('');
    };
    return (
        <div className="list-request-v-container">
            <table className="table-container">
                <thead className="table-header">
                <tr>
                    <th>Image</th>
                    <th>Description</th>
                    <th>Status</th>
                    <th>ID</th>
                    <th>Account ID</th>
                    <th>Owner</th>
                    <th>Price</th>
                </tr>
                </thead>
                <tbody>
                {data.map((item) => (
                    <tr key={item.id} className="table-row">
                        <td className="px-4 py-2 text-sm">
                            {item.image ? (
                                <div
                                    className="bg-cover bg-center rounded-full w-10 h-10"
                                    style={{
                                        backgroundImage: `url(data:image/${item.imageType};base64,${item.image})`,
                                    }}
                                    onClick={() => openModal(item.image)}
                                ></div>
                            ) : (
                                <div className="w-10 h-10 bg-gray-200 rounded-full"></div>
                            )}
                        </td>
                        <td className="description">{item.description}</td>
                        <td className="status">{item.status}</td>
                        <td>
                            <button className="button">{item.id}</button>
                        </td>
                        <td className="account-id">{item.accountId}</td>
                        <td className="owner">{item.owner}</td>
                        <td className="price">${item.estimatePriceMax}</td>
                    </tr>
                ))}
                </tbody>
            </table>
        </div>
    );
};

export default ListRequestV;
