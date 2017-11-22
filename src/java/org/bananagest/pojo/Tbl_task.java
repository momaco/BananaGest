package org.bananagest.pojo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author ol
 */
@Entity
@Table(name = "tbl_user" ,catalog = "bananaguest")
public class Tbl_task {
    
    @Id @GeneratedValue
    @Column(name = "idTask", nullable = true)
    private int idTask;
    
    @Column(name = "taskName")
    private String taskName;
    
    @Column(name = "start")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date start;
    
    @Column(name = "finish")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date finish;
    
    @Column(name = "idUser", nullable = true)
    private int idUser;
    
    @Column(name = "idProyect", nullable = true)
    private Tbl_user idProyect;

    public int getIdTask() {
        return idTask;
    }

    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public Tbl_user getIdProyect() {
        return idProyect;
    }

    public void setIdProyect(Tbl_user idProyect) {
        this.idProyect = idProyect;
    }

}
