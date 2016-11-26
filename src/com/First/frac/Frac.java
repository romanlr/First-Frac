package com.First.frac;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;


public class Frac {
    int ch;
    int zn;

    Frac(int a,int b){
        ch=a;
        zn=b;
    }

    Frac (int a){
        ch=a;
        zn=1;
    }

    Frac(){
        ch=0;
        zn=0;
    }

    public String toString (){
        return (this.ch+"/"+this.zn);
    }


    public Frac sum(Frac f){
        return new Frac(this.ch*f.zn+this.zn*f.ch
                        ,this.zn*f.zn);
    }

    public Frac sum(int a){
        Frac f=new Frac(a);
        return new Frac (this.ch+f.ch*this.zn,this.zn);
    }

    public Frac mult(int a){
        Frac f =new Frac(a);
        return new Frac(this.ch*f.ch,this.zn);
    }

    public Frac mult(Frac a){
        return new Frac(this.ch*a.ch,this.zn*a.zn);
    }

    public Frac div(Frac a){
        return new Frac(this.ch*a.zn,a.ch*this.zn);
    }

    public Frac div(int a){
        Frac f=new Frac(a);
        return new Frac(this.ch*f.zn,this.zn*f.ch);
    }

    public Frac inverse (){
        return new Frac(this.zn,this.ch);
    }

    public boolean isDenumenatorZero(){
        return (this.zn==0);
    }

    public boolean isShorten(){
        int a=this.ch;
        int b=this.zn;
        while((a!=0)&(b!=0)){
            if (a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        return (a+b!=1);
    }

    public Frac makeshort(){
        int a = this.ch;
        int b = this.zn;
        while (a!=0&&b!=0){
            if (a>b){
                a%=b;
            }
            else{
                b%=a;
            }
        }
        return new Frac(this.ch/(a+b),this.zn/(a+b));
    }

    public boolean isEqual(Frac a){
        System.out.println(this.makeshort());
        System.out.println(a.makeshort());
        return ((this.makeshort())==(a.makeshort()));//не работает
    }
    public int compareTo(Frac a){
        int it=this.ch*a.zn-this.zn*a.ch;
        if (it>0){
            it=1;
        }
        if (it<0){
            it=-1;
        }
        return (it);
    }
}