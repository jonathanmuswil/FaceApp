package com.google.firebase.remoteconfig;

import AC;
import CB;
import CC;
import DB;
import HC;
import JB;
import LA;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.e;
import com.google.firebase.FirebaseApp;
import com.google.firebase.d;
import com.google.firebase.iid.FirebaseInstanceId;
import dQ;
import fQ;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import nC;
import qP;
import xA;
import xC;
import zC;

public class h
{
  private static final ExecutorService a = ;
  private static final e b = com.google.android.gms.common.util.h.d();
  private static final Random c = new Random();
  private final Map<String, a> d = new HashMap();
  private final Context e;
  private final FirebaseApp f;
  private final FirebaseInstanceId g;
  private final dQ h;
  private final fQ i;
  private final String j;
  private Map<String, String> k = new HashMap();
  private String l = "https://firebaseremoteconfig.googleapis.com/";
  
  h(Context paramContext, FirebaseApp paramFirebaseApp, FirebaseInstanceId paramFirebaseInstanceId, dQ paramdQ, fQ paramfQ)
  {
    this(paramContext, a, paramFirebaseApp, paramFirebaseInstanceId, paramdQ, paramfQ, new HC(paramContext, paramFirebaseApp.d().b()));
  }
  
  private h(Context paramContext, Executor paramExecutor, FirebaseApp paramFirebaseApp, FirebaseInstanceId paramFirebaseInstanceId, dQ paramdQ, fQ paramfQ, HC paramHC)
  {
    this.e = paramContext;
    this.f = paramFirebaseApp;
    this.g = paramFirebaseInstanceId;
    this.h = paramdQ;
    this.i = paramfQ;
    this.j = paramFirebaseApp.d().b();
    qP.a(paramExecutor, new o(this));
    paramHC.getClass();
    qP.a(paramExecutor, p.a(paramHC));
  }
  
  private final a a(FirebaseApp paramFirebaseApp, String paramString, dQ paramdQ, Executor paramExecutor, nC paramnC1, nC paramnC2, nC paramnC3, xC paramxC, zC paramzC, AC paramAC)
  {
    try
    {
      if (!this.d.containsKey(paramString))
      {
        a locala = new com/google/firebase/remoteconfig/a;
        Context localContext = this.e;
        if (!paramString.equals("firebase")) {
          paramdQ = null;
        }
        locala.<init>(localContext, paramFirebaseApp, paramdQ, paramExecutor, paramnC1, paramnC2, paramnC3, paramxC, paramzC, paramAC);
        locala.e();
        this.d.put(paramString, locala);
      }
      paramFirebaseApp = (a)this.d.get(paramString);
      return paramFirebaseApp;
    }
    finally {}
  }
  
  public static nC a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    paramString1 = String.format("%s_%s_%s_%s.json", new Object[] { "frc", paramString1, paramString2, paramString3 });
    return nC.a(a, CC.a(paramContext, paramString1));
  }
  
  private final nC a(String paramString1, String paramString2)
  {
    return a(this.e, this.j, paramString1, paramString2);
  }
  
  private final CB b(String paramString)
  {
    JB localJB = new JB(paramString);
    try
    {
      DB localDB = new DB;
      xA localxA = new xA;
      localxA.<init>();
      LA localLA = LA.a();
      paramString = new com/google/firebase/remoteconfig/q;
      paramString.<init>(this);
      localDB.<init>(localxA, localLA, paramString);
      paramString = ((DB)localDB.a(this.l)).a(localJB).a();
      return paramString;
    }
    finally {}
  }
  
  public a a(String paramString)
  {
    try
    {
      nC localnC1 = a(paramString, "fetch");
      nC localnC2 = a(paramString, "activate");
      nC localnC3 = a(paramString, "defaults");
      Object localObject1 = String.format("%s_%s_%s_%s", new Object[] { "frc", this.j, paramString, "settings" });
      Object localObject2 = this.e.getSharedPreferences((String)localObject1, 0);
      localObject1 = new AC;
      ((AC)localObject1).<init>((SharedPreferences)localObject2);
      FirebaseApp localFirebaseApp = this.f;
      localObject2 = this.h;
      ExecutorService localExecutorService = a;
      xC localxC = new xC;
      localxC.<init>(this.e, this.f.d().b(), this.g, this.i, paramString, a, b, c, localnC1, b(this.f.d().a()), (AC)localObject1);
      zC localzC = new zC;
      localzC.<init>(localnC2, localnC3);
      paramString = a(localFirebaseApp, paramString, (dQ)localObject2, localExecutorService, localnC1, localnC2, localnC3, localxC, localzC, (AC)localObject1);
      return paramString;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/remoteconfig/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */