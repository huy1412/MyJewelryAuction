import React from 'react';

function StartingPriceInput({ value, onChange }) {
    return (
        <div className="flex max-w-[480px] flex-wrap items-end gap-4 px-4 py-3">
            <label className="flex flex-col min-w-40 flex-1">
                <input
                    type="number"
                    placeholder="Starting price"
                    className="form-input flex w-full min-w-0 flex-1 resize-none overflow-hidden rounded-xl text-[#1b190e] focus:outline-0 focus:ring-0 border border-[#e7e3d0] bg-[#fcfbf8] focus:border-[#e7e3d0] h-14 placeholder:text-[#978a4e] p-[15px] text-base font-normal leading-normal"
                    value={value}
                    onChange={onChange}
                    required
                />
            </label>
        </div>
    );
}

export default StartingPriceInput;
