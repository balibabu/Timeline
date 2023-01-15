import React from 'react'
import Clock from './Clock';
import Toggle from './Toggle';
import Toggle2 from './Toggle2';

function App1() {
    return (
        <>
            <Clock />
            <Toggle/>  {/* class component: with binding   */}
            <Toggle2/> {/* class component: without binding   */}
        </>
    );
}

export default App1;