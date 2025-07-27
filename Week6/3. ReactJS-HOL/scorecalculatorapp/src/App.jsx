import './App.css';
import { CalculateScore } from './Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore
        Name="Dinesh Ram A"
        School="St.Thomas Matric hr Sec School"
        total={467}
        goal={499}
      />
    </div>
  );
}

export default App;
