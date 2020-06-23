package API;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Lolla implements Serializable {
    private String term;
    private List <Resultados> lolla;

    public Lolla () {
        this.lolla = new ArrayList();
    }
    public Lolla (String term, List <Resultados> data){
        this.term = term;
        this.lolla = data;
    }
    public String getTerm(){
        return term;
    }
    public void setTerm (String term){
        this.term = term;
    }
    public List <Resultados> getResultados (){
        return lolla;
    }
    public void getResults( List<Resultados> resultados){
        this.lolla = resultados == null ? new ArrayList(): resultados;
    }

}
