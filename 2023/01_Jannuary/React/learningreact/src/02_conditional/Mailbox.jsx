import React from "react";

function UserGreeting(props){
    return <h1>Welcome Back!</h1>;
}

function GuestGreeting(props){
    return <h1>Please Sign Up</h1>;
}

function Greet(props){
    if(props.isLogged){
        return <UserGreeting/>
    }else{
        return <GuestGreeting/>
    }
}

class Mailbox extends React.Component{
    constructor(props){
        super(props);
        this.state={isLogged:false};
    }

    loginBtnHandler=()=>{
        this.setState({isLogged:true});
    }

    logoutBtnHandler=()=>{
        this.setState({isLogged:false});
    }

    LoginBtn=()=>{
        return <button onClick={this.loginBtnHandler}>Login</button>
    }
    LogoutBtn=()=>{
        return <button onClick={this.logoutBtnHandler}>Logout</button>
    }

    render(){
        var btn=this.LoginBtn;
        if(this.state.isLogged){
            btn=this.LogoutBtn;
        }
        return <>
        <Greet isLogged={this.state.isLogged}/>
        {btn()}
        </>

    }
}

export default Mailbox;