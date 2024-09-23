import React from 'react';
import Header from './components/Header';
import RequestAuction from './components/RequestAcution';
import './App.css'; // Assuming you want to keep custom styles here

function App() {
  return (
      <div className="relative flex size-full min-h-screen flex-col bg-[#fcfbf8] group/design-root overflow-x-hidden" style={{ fontFamily: '"Noto Serif", "Noto Sans", sans-serif' }}>
        <div className="layout-container flex h-full grow flex-col">
          <Header />
          <div className="px-40 flex flex-1 justify-center py-5">
            <RequestAuction />
          </div>
        </div>
      </div>
  );
}

export default App;
