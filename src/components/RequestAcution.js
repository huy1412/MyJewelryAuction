// import React, { useState } from 'react';
// import axios from 'axios';
// import { ToastContainer, toast } from 'react-toastify';
// import 'react-toastify/dist/ReactToastify.css';
//
// function RequestAuction() {
//     const [description, setDescription] = useState('');
//     const [startingPrice, setStartingPrice] = useState('');
//     const [image, setImage] = useState(null);
//
//     const handleSubmit = async (event) => {
//         event.preventDefault();
//
//         const formData = new FormData();
//         formData.append('estimatePriceMax', startingPrice);
//         formData.append('description', description);
//         if (image) formData.append('image', image);
//
//         try {
//             const response = await axios.post('http://localhost:8080/myproject/makeRequest', formData, {
//                 headers: {
//                     'Content-Type': 'multipart/form-data'
//                 }
//             });
//             console.log('Response:', response.data);
//             toast.success('Request submitted successfully!');
//         } catch (error) {
//             console.error('Error submitting form:', error);
//             toast.error('Failed to submit request.');
//         }
//     };
//
//
//     const handleImage = (e) => {
//         setImage(e.target.files[0]);
//     };
//
//     return (
//         <div className="layout-content-container flex flex-col w-[512px] max-w-[512px] py-5 max-w-[960px] flex-1">
//             <ToastContainer />
//             <h3 className="text-[#1b190e] tracking-light text-2xl font-bold leading-tight px-4 text-center pb-2 pt-5">Request an auction</h3>
//             <form onSubmit={handleSubmit} className="flex flex-col gap-4 px-4">
//                 <div className="flex items-center gap-4 bg-[#fcfbf8] px-4 min-h-14 justify-between">
//                     <div className="flex items-center gap-4">
//                         <div className="text-[#1b190e] flex items-center justify-center rounded-lg bg-[#f3f1e7] shrink-0 size-10" data-icon="Image" data-size="24px" data-weight="regular">
//                             <svg xmlns="http://www.w3.org/2000/svg" width="24px" height="24px" fill="currentColor" viewBox="0 0 256 256">
//                                 <path d="M216,40H40A16,16,0,0,0,24,56V200a16,16,0,0,0,16,16H216a16,16,0,0,0,16-16V56A16,16,0,0,0,216,40Zm0,16V158.75l-26.07-26.06a16,16,0,0,0-22.63,0l-20,20-44-44a16,16,0,0,0-22.62,0L40,149.37V56ZM40,172l52-52,80,80H40Zm176,28H194.63l-36-36,20-20L216,181.38V200ZM144,100a12,12,0,1,1,12,12A12,12,0,0,1,144,100Z"></path>
//                             </svg>
//                         </div>
//                         <p className="text-[#1b190e] text-base font-normal leading-normal flex-1 truncate">Your jewelry</p>
//                     </div>
//                     <div className="shrink-0">
//                         <input type="file" name="file" onChange={handleImage} />
//                     </div>
//                 </div>
//                 <div className="flex max-w-[480px] flex-wrap items-end gap-4 px-4 py-3">
//                     <label className="flex flex-col min-w-40 flex-1">
//                         <textarea
//                             placeholder="Add a description of your item"
//                             className="form-input flex w-full min-w-0 flex-1 resize-none overflow-hidden rounded-xl text-[#1b190e] focus:outline-0 focus:ring-0 border border-[#e7e3d0] bg-[#fcfbf8] focus:border-[#e7e3d0] min-h-36 placeholder:text-[#978a4e] p-[15px] text-base font-normal leading-normal"
//                             value={description}
//                             onChange={(e) => setDescription(e.target.value)}
//                             required
//                         />
//                     </label>
//                 </div>
//                 <div className="flex max-w-[480px] flex-wrap items-end gap-4 px-4 py-3">
//                     <label className="flex flex-col min-w-40 flex-1">
//                         <input
//                             type="number"
//                             placeholder="Starting price"
//                             className="form-input flex w-full min-w-0 flex-1 resize-none overflow-hidden rounded-xl text-[#1b190e] focus:outline-0 focus:ring-0 border border-[#e7e3d0] bg-[#fcfbf8] focus:border-[#e7e3d0] h-14 placeholder:text-[#978a4e] p-[15px] text-base font-normal leading-normal"
//                             value={startingPrice}
//                             onChange={(e) => setStartingPrice(e.target.value)}
//                             required
//                         />
//                     </label>
//                 </div>
//                 <div className="flex px-4 py-3">
//                     <button
//                         type="submit"
//                         className="flex min-w-[84px] max-w-[480px] cursor-pointer items-center justify-center overflow-hidden rounded-full h-10 px-4 flex-1 bg-[#ebcd47] text-[#1b190e] text-sm font-bold leading-normal tracking-[0.015em]"
//                     >
//                         <span className="truncate">Request auction</span>
//                     </button>
//                 </div>
//             </form>
//         </div>
//     );
// }
//
// export default RequestAuction;
import React, { useState } from 'react';
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';

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
                const response = await fetch('http://localhost:8080/myproject/makeRequest', {
                    method: 'POST',
                    headers: {
                        'Content-Type': 'application/json'
                    },
                    body: JSON.stringify(data)
                });
                const responseData = await response.json();
                console.log('Response:', responseData);
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
                description
            };

            try {
                const response = await fetch('http://localhost:8080/myproject/makeRequest', {
                    method: 'POST',
                    headers: {
                        'Content-Type': 'application/json'
                    },
                    body: JSON.stringify(data)
                });
                const responseData = await response.json();
                console.log('Response:', responseData);
                toast.success('Request submitted successfully!');
            } catch (error) {
                console.error('Error submitting form:', error);
                toast.error('Failed to submit request.');
            }
        }
    };

    const handleImage = (e) => {
        setImage(e.target.files[0]);
    };

    return (
        <div className="layout-content-container flex flex-col w-[512px] max-w-[512px] py-5 max-w-[960px] flex-1">
            <ToastContainer />
            <h3 className="text-[#1b190e] tracking-light text-2xl font-bold leading-tight px-4 text-center pb-2 pt-5">Request an auction</h3>
            <form onSubmit={handleSubmit} className="flex flex-col gap-4 px-4">
                <div className="flex items-center gap-4 bg-[#fcfbf8] px-4 min-h-14 justify-between">
                    <div className="flex items-center gap-4">
                        <div className="text-[#1b190e] flex items-center justify-center rounded-lg bg-[#f3f1e7] shrink-0 size-10" data-icon="Image" data-size="24px" data-weight="regular">
                            <svg xmlns="http://www.w3.org/2000/svg" width="24px" height="24px" fill="currentColor" viewBox="0 0 256 256">
                                <path d="M216,40H40A16,16,0,0,0,24,56V200a16,16,0,0,0,16,16H216a16,16,0,0,0,16-16V56A16,16,0,0,0,216,40Zm0,16V158.75l-26.07-26.06a16,16,0,0,0-22.63,0l-20,20-44-44a16,16,0,0,0-22.62,0L40,149.37V56ZM40,172l52-52,80,80H40Zm176,28H194.63l-36-36,20-20L216,181.38V200ZM144,100a12,12,0,1,1,12,12A12,12,0,0,1,144,100Z"></path>
                            </svg>
                        </div>
                        <p className="text-[#1b190e] text-base font-normal leading-normal flex-1 truncate">Your jewelry</p>
                    </div>
                    <div className="shrink-0">
                        <input type="file" name="file" onChange={handleImage} />
                    </div>
                </div>
                <div className="flex max-w-[480px] flex-wrap items-end gap-4 px-4 py-3">
                    <label className="flex flex-col min-w-40 flex-1">
                        <textarea
                            placeholder="Add a description of your item"
                            className="form-input flex w-full min-w-0 flex-1 resize-none overflow-hidden rounded-xl text-[#1b190e] focus:outline-0 focus:ring-0 border border-[#e7e3d0] bg-[#fcfbf8] focus:border-[#e7e3d0] min-h-36 placeholder:text-[#978a4e] p-[15px] text-base font-normal leading-normal"
                            value={description}
                            onChange={(e) => setDescription(e.target.value)}
                            required
                        />
                    </label>
                </div>
                <div className="flex max-w-[480px] flex-wrap items-end gap-4 px-4 py-3">
                    <label className="flex flex-col min-w-40 flex-1">
                        <input
                            type="number"
                            placeholder="Starting price"
                            className="form-input flex w-full min-w-0 flex-1 resize-none overflow-hidden rounded-xl text-[#1b190e] focus:outline-0 focus:ring-0 border border-[#e7e3d0] bg-[#fcfbf8] focus:border-[#e7e3d0] h-14 placeholder:text-[#978a4e] p-[15px] text-base font-normal leading-normal"
                            value={startingPrice}
                            onChange={(e) => setStartingPrice(e.target.value)}
                            required
                        />
                    </label>
                </div>
                <div className="flex px-4 py-3">
                    <button
                        type="submit"
                        className="flex min-w-[84px] max-w-[480px] cursor-pointer items-center justify-center overflow-hidden rounded-full h-10 px-4 flex-1 bg-[#ebcd47] text-[#1b190e] text-sm font-bold leading-normal tracking-[0.015em]"
                    >
                        <span className="truncate">Request auction</span>
                    </button>
                </div>
            </form>
        </div>
    );
}

export default RequestAuction;
