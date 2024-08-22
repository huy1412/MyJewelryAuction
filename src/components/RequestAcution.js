
import React, { useState } from 'react';
import axios from 'axios';
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';

import ImageUploader from './ImageUploader';
import DescriptionInput from './DescriptionInput';
import StartingPriceInput from './StartingPriceInput';
import SubmitButton from './SubmitButton';

function RequestAuction() {
    const [description, setDescription] = useState('');
    const [startingPrice, setStartingPrice] = useState('');
    const [image, setImage] = useState(null);

    const handleSubmit = async (event) => {
        event.preventDefault();

        const fileReader = new FileReader();
        fileReader.onloadend = async () => {
            const base64String = fileReader.result.split(',')[1];
            const data = {
                estimatePriceMax: startingPrice,
                description,
                image: base64String
            };

            try {
                const response = await axios.post('http://localhost:8080/myproject/makeRequest', data, {
                    headers: {
                        'Content-Type': 'application/json'
                    }
                });
                console.log('Response:', response.data);
                toast.success('Request submitted successfully!');
            } catch (error) {
                console.error('Error submitting form:', error);
                toast.error('Failed to submit request.');
            }
        };

        if (image) {
            fileReader.readAsDataURL(image);
        } else {
            // Handle case where no image is selected
            const data = {
                estimatePriceMax: startingPrice,
                description,
                image: null
            };

            try {
                const response = await axios.post('http://localhost:8080/myproject/makeRequest', data, {
                    headers: {
                        'Content-Type': 'application/json'
                    }
                });
                console.log('Response:', response.data);
                toast.success('Request submitted successfully!');
            } catch (error) {
                console.error('Error submitting form:', error);
                toast.error('Failed to submit request.');
            }
        }
    };

    const handleImageChange = (e) => {
        setImage(e.target.files[0]);
    };

    return (
        <div className="layout-content-container flex flex-col w-[512px] max-w-[512px] py-5 max-w-[960px] flex-1">
            <ToastContainer />
            <h3 className="text-[#1b190e] tracking-light text-2xl font-bold leading-tight px-4 text-center pb-2 pt-5">Request an auction</h3>
            <form onSubmit={handleSubmit} className="flex flex-col gap-4 px-4">
                <ImageUploader onImageChange={handleImageChange} />
                <DescriptionInput value={description} onChange={(e) => setDescription(e.target.value)} />
                <StartingPriceInput value={startingPrice} onChange={(e) => setStartingPrice(e.target.value)} />
                <SubmitButton />
            </form>
        </div>
    );
}

export default RequestAuction;


