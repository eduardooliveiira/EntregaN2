package API;

import java.io.Serializable;

public class Resultados implements Serializable{
    int publico;
    String date;
    String local;
    String atracoes;

    public String getDate (){
        return date;
    }
    public void setDate(String Date){
        this.date = date;
    }
    public String getLocal(){
        return local;
    }
    public void setLocal(String local){
        this.local;
    }
    public String getAtracoes (){
        return atracoes;
    }
    public void setAtracoes(String Date){
        this.atracoes = atracoes;
    }


}
