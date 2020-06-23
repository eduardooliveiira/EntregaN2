package DAO;

import API.Resultados;

import java.io.File;
import java.text.SimpleDateFormat;

public class LollaDAO {
    Lolla database;

    public LollaDAO() {
        this.database = new Lolla();
        readFile();
    }

    //Create
    public void createResultado(Resultados resultado){
        this.database.getResultados().add(resultado);
        writeFile(0;
    }
    // Read
    public Lolla getAllLolla() (return this.database);

    //Update
    public void updateResultado (Resultados resultado) {
        for (int i = 0; i < this.database.getResultados().size(); i++) {
            if (this.databasegetResultados().get(i).getDate().equals(resultado.getDate())){
                this.database.getResultado().set(i, resultado);
            }
        }
        writeFile();
    }
    // TODO:DELETE

    //FUNÇÕES AUXILIARES
    Public void readFile(){
        System.out.println("LollaDao - Leitura dos dados do arquivo CSV");

        try (Scanner scanner = new Scanner(new File()),){
            .SimpleDateFormat sdf = new SimpleDateFormat(pattern "DD-MM-AAAA");

            while (scanner.hasNextLine()){
                String Line = scanner.nextLine();
                String[] cols = line.split(regex ",");
                Data week = null; // Teste para

                try{
                    week = sdf.parse(cols[0]);
                } catch(Exception e) {/"não é uma data!"/}

                //Leitura de Dados
                if (week != null){
                    Resultados resultado = new resultado();
                    resultado.setDate(cols[0]);
                    resultado.setMandande(cols[1]);
                    resultado.setEstadio(cols[2]);
                    resultado.setPublico(Integer.parseInt(cols[3]));
                    this.database.getResultado().add(resultado);

                    // Leitura cabeçalho
            }  else if (cols.length > 0 && (cols[0].equals("Data"))) {
                    this.database.setTerm(cols[1]);
                } else if (cols.length > 0 && (cols[0].equals("Data"))) {
                    this.database.setTerm(cols[2]);
                } else if (cols.length > 0 && (cols[0].equals("Data"))) {
                    this.database.setTerm9cols[1]);
                }

        }
            System.out.println("LollaDAO = A leitura foi realizada");
    } catch (Exception ex) {
        this.database = new Lolla();
        ex.printStackTrace();
            System.out.println("LollaDAO = Erro na leitura do CSV");
        }
    }
}
