package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

public class yu
{
  private final Context a;
  private final mL b;
  private final String c;
  private Bundle d;
  
  private yu(a parama)
  {
    this.a = a.a(parama);
    this.b = a.b(parama);
    this.d = a.c(parama);
    this.c = a.d(parama);
  }
  
  final Context a(Context paramContext)
  {
    if (this.c != null) {
      return paramContext;
    }
    return this.a;
  }
  
  final a a()
  {
    a locala = new a();
    locala.a(this.a);
    locala.a(this.b);
    locala.a(this.c);
    locala.a(this.d);
    return locala;
  }
  
  final mL b()
  {
    return this.b;
  }
  
  final Bundle c()
  {
    return this.d;
  }
  
  final String d()
  {
    return this.c;
  }
  
  public static final class a
  {
    private Context a;
    private mL b;
    private Bundle c;
    private String d;
    
    public final a a(Context paramContext)
    {
      this.a = paramContext;
      return this;
    }
    
    public final a a(Bundle paramBundle)
    {
      this.c = paramBundle;
      return this;
    }
    
    public final a a(mL parammL)
    {
      this.b = parammL;
      return this;
    }
    
    public final a a(String paramString)
    {
      this.d = paramString;
      return this;
    }
    
    public final yu a()
    {
      return new yu(this, null);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */