package com.interfacepolyparamater;

public class InterFacePolyPass {
    public void main(String[] args) {
        IG ig = new Teacher();
        IH ih = new Teacher();
    }
interface IH{}
interface IG extends IH{}
class Teacher implements IG{
    }
}