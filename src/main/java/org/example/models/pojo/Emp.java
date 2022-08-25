package org.example.models.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Emp {
    @Id
    private int Empno;
    private String Ename;
    private String Job;
    private int Mgr;
    private LocalDate HireDate;
    private int Sal;
    private int Comm;
    private int Deptno;

    public Emp() {
    }

    public Emp(int empno, String ename, String job, int mgr, LocalDate hireDate, int sal, int comm, int deptno) {
        Empno = empno;
        Ename = ename;
        Job = job;
        Mgr = mgr;
        HireDate = hireDate;
        Sal = sal;
        Comm = comm;
        Deptno = deptno;
    }

    public int getEmpno() {
        return Empno;
    }

    public void setEmpno(int empno) {
        Empno = empno;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    public int getMgr() {
        return Mgr;
    }

    public void setMgr(int mgr) {
        Mgr = mgr;
    }

    public LocalDate getHireDate() {
        return HireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        HireDate = hireDate;
    }

    public int getSal() {
        return Sal;
    }

    public void setSal(int sal) {
        Sal = sal;
    }

    public int getComm() {
        return Comm;
    }

    public void setComm(int comm) {
        Comm = comm;
    }

    public int getDeptno() {
        return Deptno;
    }

    public void setDeptno(int deptno) {
        Deptno = deptno;
    }
}
