import './App.css';
import { CalculateScore } from './Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore
        Name="Dinesh Ram A"
        School="St.Thomas CBSE School"
        total={490}
        goal={98%}
      />
    </div>
  );
}

export default App;
