import './App.css';
import Header from './Components/Header';
import MainContainer from './Components/MainContainer';


function App() {
  return (
    <div className="App">
      <header className="App-header sticky-top">
        <Header/>
      </header>
      <div className='mainContainer'>
      <MainContainer/>
      </div>
    </div>
  );
}

export default App;
