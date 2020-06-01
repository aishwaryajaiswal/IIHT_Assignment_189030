import React from 'react';
import logo from './logo.svg';
import './App.css';
import Example from  '../src/Example';
import Page from '../src/Page';
import {BrowserRouter as Router,Route} from "react-router-dom";

function App() {
  return (
    <div className="App">
       <Router>
      <Route exact path="/" component={Example}></Route>
       <Route exact path="/information" component={Page}></Route>
       </Router>
    </div>
  );
}

export default App;
