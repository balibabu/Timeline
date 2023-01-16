import React from 'react'
import ChildComponent from './ChildComponent';
import { ThemeProvider } from './ThemeContext';

function App3() {
  return (
    <ThemeProvider>
        <ChildComponent/>
    </ThemeProvider>
  );
}

export default App3;