import React from 'react';

function SubmitButton() {
    return (
        <div className="flex px-4 py-3">
            <button
                type="submit"
                className="flex min-w-[84px] max-w-[480px] cursor-pointer items-center justify-center overflow-hidden rounded-full h-10 px-4 flex-1 bg-[#ebcd47] text-[#1b190e] text-sm font-bold leading-normal tracking-[0.015em]"
            >
                <span className="truncate">Request auction</span>
            </button>
        </div>
    );
}

export default SubmitButton;
