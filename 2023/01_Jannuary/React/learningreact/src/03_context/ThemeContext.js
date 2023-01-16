import React from "react";

const ThemeContext = React.createContext();

function ThemeProvider(props){
    const theme='light';
    return(<ThemeContext.Provider value={theme}>
        {props.children}
    </ThemeContext.Provider>);
}

export default ThemeContext;
export {ThemeProvider};