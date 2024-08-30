import React from 'react';

function ImageUploader({ onImageChange }) {
    return (
        <div className="flex items-center gap-4 bg-[#fcfbf8] px-4 min-h-14 justify-between">
            <div className="flex items-center gap-4">
                <div className="text-[#1b190e] flex items-center justify-center rounded-lg bg-[#f3f1e7] shrink-0 size-10">
                    {/* SVG icon */}
                </div>
                <p className="text-[#1b190e] text-base font-normal leading-normal flex-1 truncate">Your jewelry</p>
            </div>
            <div className="shrink-0">
                <input type="file" name="file" onChange={onImageChange} />
            </div>
        </div>
    );
}

export default ImageUploader;