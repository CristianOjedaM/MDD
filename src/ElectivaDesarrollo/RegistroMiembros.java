package ElectivaDesarrollo;


/**
* @generated
*/
public class RegistroMiembros {
    
    /**
    * @generated
    */
    private int numeroMiembro;
    
    /**
    * @generated
    */
    private int cantidadPagar;
    
    
    /**
    * @generated
    */
    private Set<Miembro> miembro;
    
    /**
    * @generated
    */
    private ClubVolley clubVolley;
    
    /**
    * @generated
    */
    private Set<Factura> factura;
    
    

    /**
    * @generated
    */
    public int getNumeroMiembro() {
        return this.numeroMiembro;
    }
    
    /**
    * @generated
    */
    public int setNumeroMiembro(Integer numeroMiembro) {
        this.numeroMiembro = numeroMiembro;
    }
    
    
    /**
    * @generated
    */
    public int getCantidadPagar() {
        return this.cantidadPagar;
    }
    
    /**
    * @generated
    */
    public int setCantidadPagar(Integer cantidadPagar) {
        this.cantidadPagar = cantidadPagar;
    }
    
    
    
    /**
    * @generated
    */
    public ClubVolley getClubVolley() {
        return this.clubVolley;
    }
    
    /**
    * @generated
    */
    public ClubVolley setClubVolley(ClubVolley clubVolley) {
        this.clubVolley = clubVolley;
    }
    
    
    /**
    * @generated
    */
    public Set<Miembro> getMiembro() {
        if (this.miembro == null) {
            this.miembro = new HashSet<Miembro>();
        }
        return this.miembro;
    }
    
    /**
    * @generated
    */
    public Set<Miembro> setMiembro(Miembro miembro) {
        this.miembro = miembro;
    }
    
    
    /**
    * @generated
    */
    public Set<Factura> getFactura() {
        if (this.factura == null) {
            this.factura = new HashSet<Factura>();
        }
        return this.factura;
    }
    
    /**
    * @generated
    */
    public Set<Factura> setFactura(Factura factura) {
        this.factura = factura;
    }
    
    
    
}
