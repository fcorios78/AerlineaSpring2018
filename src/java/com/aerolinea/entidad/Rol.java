package com.aerolinea.entidad;
// Generated 07-17-2018 10:38:49 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Rol generated by hbm2java
 */
@Entity
@Table(name="rol"
    ,catalog="aerolinea2"
)
public class Rol  implements java.io.Serializable {


     private Integer idrol;
     private String rol;
     private Set<Usuario> usuarios = new HashSet<Usuario>(0);

    public Rol() {
    }

	
    public Rol(String rol) {
        this.rol = rol;
    }
    public Rol(String rol, Set<Usuario> usuarios) {
       this.rol = rol;
       this.usuarios = usuarios;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idrol", unique=true, nullable=false)
    public Integer getIdrol() {
        return this.idrol;
    }
    
    public void setIdrol(Integer idrol) {
        this.idrol = idrol;
    }

    
    @Column(name="rol", nullable=false, length=45)
    public String getRol() {
        return this.rol;
    }
    
    public void setRol(String rol) {
        this.rol = rol;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="rol")
    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }




}


