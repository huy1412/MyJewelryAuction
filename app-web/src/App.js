import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Header from './components/Header';
import RequestAuction from './components/RequestAuction';
import ListRequestV from './components/ListRequestV'; // Ensure this component exists and is correctly named
import './App.css'; // Ensure this file exists and is correctly linked

function App() {
    return (
        <Router>
            <div className="relative flex size-full min-h-screen flex-col bg-[#fcfbf8] group/design-root overflow-x-hidden" style={{ fontFamily: '"Noto Serif", "Noto Sans", sans-serif' }}>
                <div className="layout-container flex h-full grow flex-col">
                    <Header />
                    <div className="px-40 flex flex-1 justify-center py-5">
                        <Routes>
                            <Route path="/" element={<RequestAuction />} />
                            <Route path="/list-request-valuation" element={<ListRequestV />} />
                        </Routes>
                    </div>
                </div>
            </div>
        </Router>
    );
}

export default App;
