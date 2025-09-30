
package carros;

public class carro1 {
    
    private String marca;
    private int ano;
    private String modelo;
    private int velocidade;

    
    public carro1(String marca, int ano, String modelo, int velocidade)
            
    {
       this.ano = ano;
       this.marca = marca;
       this.modelo = modelo;
       this.velocidade = velocidade;
        
    }
    public carro1 (carro1 carro)
    {
        this(carro.getmarca(),carro.getano(), carro.getmodelo(), carro.getvelocidade());
    }
    
    //setters
    public void setcarro(String marca, int ano, String modelo, int velocidade)
    {
        setmarca(marca);
        setano(ano);
        setmodelo(modelo);
        setvelocidade(velocidade);
    }
    
    public void setmarca(String marca)
    {
        marca = ("");
    }
    public void setano(int ano)
    {
        ano = (0);
    }
    public void setmodelo (String modelo)
    {
        modelo = ("");
    }
    public void setvelocidade(int velocidade)
    {
        velocidade = (0);
    }
    
    
    //GETTERS
   public String getmarca ()
   {
       return marca;
       
   }
   public int getano()
   {
       return ano;
   }
   public String getmodelo()
   {
       return modelo;
   }

   public int getvelocidade()
   {
       return velocidade;
   }

    /**
     *
     * @return
     */
    @Override
     public String toString()
        {
            return String.format("%s:%02d:%s:%02d:", getmarca(), getano(), getmodelo(), getvelocidade() );
        }

    
    
    
    
}
