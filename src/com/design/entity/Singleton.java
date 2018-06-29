package com.design.entity;
public class Singleton
{
    /** Constructeur priv� */
    private Singleton()
    {}
     
    /** Instance unique non pr�initialis�e */
    private static Singleton INSTANCE = null;
     
    /** Point d'acc�s pour l'instance unique du singleton */
    public static Singleton getInstance()
    {           
        if (INSTANCE == null)
        {   INSTANCE = new Singleton(); 
        }
        return INSTANCE;
    }
}
