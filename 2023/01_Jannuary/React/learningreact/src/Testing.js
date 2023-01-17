import React, { Component } from 'react'

export default class Testing extends Component {
    constructor() {
        super();
        console.log('constructor');
    }
    componentDidMount(){
        console.log('componentDidMount');
    }
    componentDidUpdate(){
        console.log('componentDidUpdate');
    }
    componentWillUnmount(){
        console.log('componentWillUnmount');
    }
    componentDidCatch(){
        console.log('componentDidCatch');
    }
    static getDerivedStateFromProps(){
        console.log('getDerivedStateFromProps');
    }
    shouldComponentUpdate(){
        console.log('shouldComponentUpdate');
    }
    render() {
        console.log('render');
        return (
            <div>Testing</div>
        )
    }
}
