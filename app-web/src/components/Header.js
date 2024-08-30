import React from 'react';
import { Link } from 'react-router-dom';
import "./Logo.css"; // Ensure the path is correct

function Header() {
    return (
        <header className="header">
            <div className="logo-container">
                <img src="/logo.png" alt="Logo" className="logo" />
                <h2 className="text-[#1b190e] text-lg font-bold leading-tight tracking-[-0.015em]">Luxury Auction House</h2>
            </div>
            <div className="button-container">
                <Link to="/list-request-valuation">
                    <button className="button">
                        <span className="truncate">List Request Valuation</span>
                    </button>
                </Link>
                <Link to="/">
                    <button className="button">
                        <span className="truncate">Request Valuation</span>
                    </button>
                </Link>
                <button className="button">
                    <span className="truncate">Sign in</span>
                </button>
            </div>
        </header>
    );
}

export default Header;
