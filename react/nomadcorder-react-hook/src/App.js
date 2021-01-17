import React, { useState, useEffect } from "react";
// import { render } from "react-dom";
import Axios from "axios";
import "./styles.css";

function useInput(defaulValue) {
  const [value, setValue] = useState(defaulValue);

  const onChange = (e) => {
    // 비구조화 할당
    const {
      target: { value }
    } = e;
    setValue(value);
  };

  return { value, onChange };
}

function useFetch(url) {
  const [payload, setPayload] = useState(null);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState("");

  const callUrl = async () => {
    try {
      const { data } = await Axios.get(url);
      // throw Error();
      setPayload(data);
    } catch {
      setError("Erorr!!");
    } finally {
      setLoading(false);
    }
  };

  useEffect(() => {
    callUrl();
  }, []); // only when didMount

  return { payload, loading, error };
}

export default function App() {
  // const App = () => {
  const [item, setItem] = useState(0);
  // const item = useState(1)[0];
  const [email, setEmail] = useState("");
  const name = useInput("");
  // https://randomuser.me/api/
  const { payload, loading, error } = useFetch("https://aws.random.cat/meow");

  const incrementItem = () => setItem(item + 1);
  const decrementItem = () => setItem(item - 1);

  const updateEmail = (e) => {
    const {
      target: { value }
    } = e;
    setEmail(value);
  };
  return (
    <div className="App">
      <h1>
        Hello
        {name.value}
        {email}
        {item}
      </h1>
      <h2>Start editing to see some magic happen!</h2>
      <button onClick={incrementItem}>Increment</button>
      <button onClick={decrementItem}>Decrement</button>
      <input {...name} placeholder="what is your name?" />
      <input placeholder="email" value={email} onChange={updateEmail}></input>
      <br />
      {loading && <span>loading your cat</span>}
      {!loading && error && <span>{error}</span>}
      {!loading && error && (
        <img src="https://i.pinimg.com/originals/ef/8b/bd/ef8bbd4554dedcc2fd1fd15ab0ebd7a1.gif" />
      )}
      {!loading && !error && payload && <img src={payload.file} />}
    </div>
  );
}

// class AppUgly extends Component {
//   state = {
//     item: 0
//   };
//   render() {
//     const { item } = this.state;
//     return (
//       <div className="App">
//         <h1>Hello AppUgly{item}</h1>
//         <h2>Start editing to see some magic happen!</h2>
//         <button onClick={this.incrementItem}>Increment</button>
//         <button onClick={this.decrementItem}>Decrement</button>
//       </div>
//     );
//   }
//   incrementItem = () => {
//     this.setState((state) => {
//       return {
//         item: state.item + 1
//       };
//     });
//   };
//   decrementItem = () => {
//     this.setState((state) => {
//       return {
//         item: state.item - 1
//       };
//     });
//   };
// }
// export default App;
