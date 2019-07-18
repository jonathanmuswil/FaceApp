package com.facebook.accountkit.ui;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import jn;

public final class g
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new f();
  static final String a = "g";
  private final Fb b;
  private final String c;
  private final LinkedHashSet<Ja> d = new LinkedHashSet(Ja.values().length);
  private final String e;
  private final String f;
  private final jn g;
  private final Ia h;
  private final boolean i;
  private final boolean j;
  private final AccountKitActivity.a k;
  private final String[] l;
  private final String[] m;
  
  private g(Parcel paramParcel)
  {
    this.b = ((Fb)paramParcel.readParcelable(Fb.class.getClassLoader()));
    this.c = paramParcel.readString();
    this.d.clear();
    for (int i2 : paramParcel.createIntArray()) {
      this.d.add(Ja.values()[i2]);
    }
    this.e = paramParcel.readString();
    this.f = paramParcel.readString();
    this.g = ((jn)paramParcel.readParcelable(jn.class.getClassLoader()));
    this.h = Ia.valueOf(paramParcel.readString());
    ??? = paramParcel.readByte();
    boolean bool1 = true;
    boolean bool2;
    if (??? != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.i = bool2;
    if (paramParcel.readByte() != 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    this.j = bool2;
    this.k = AccountKitActivity.a.valueOf(paramParcel.readString());
    this.l = paramParcel.createStringArray();
    this.m = paramParcel.createStringArray();
  }
  
  private g(Fb paramFb, String paramString1, LinkedHashSet<Ja> paramLinkedHashSet, String paramString2, String paramString3, jn paramjn, Ia paramIa, boolean paramBoolean1, boolean paramBoolean2, AccountKitActivity.a parama, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    this.e = paramString2;
    this.c = paramString1;
    this.f = paramString3;
    this.d.addAll(paramLinkedHashSet);
    this.b = paramFb;
    this.h = paramIa;
    this.g = paramjn;
    this.i = paramBoolean1;
    this.j = paramBoolean2;
    this.k = parama;
    this.l = paramArrayOfString1;
    this.m = paramArrayOfString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String l()
  {
    return this.c;
  }
  
  public String m()
  {
    return this.e;
  }
  
  public String n()
  {
    return this.f;
  }
  
  public jn o()
  {
    return this.g;
  }
  
  public Ia p()
  {
    return this.h;
  }
  
  public List<Ja> q()
  {
    return Collections.unmodifiableList(new ArrayList(this.d));
  }
  
  public AccountKitActivity.a r()
  {
    return this.k;
  }
  
  public String[] s()
  {
    return this.l;
  }
  
  public String[] t()
  {
    return this.m;
  }
  
  public Fb u()
  {
    return this.b;
  }
  
  public boolean v()
  {
    return this.i;
  }
  
  public boolean w()
  {
    return this.j;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.b, paramInt);
    paramParcel.writeString(this.c);
    Ja[] arrayOfJa = new Ja[this.d.size()];
    this.d.toArray(arrayOfJa);
    int[] arrayOfInt = new int[arrayOfJa.length];
    for (int n = 0; n < arrayOfJa.length; n++) {
      arrayOfInt[n] = arrayOfJa[n].ordinal();
    }
    paramParcel.writeIntArray(arrayOfInt);
    paramParcel.writeString(this.e);
    paramParcel.writeString(this.f);
    paramParcel.writeParcelable(this.g, paramInt);
    paramParcel.writeString(this.h.name());
    paramParcel.writeByte((byte)this.i);
    paramParcel.writeByte((byte)this.j);
    paramParcel.writeString(this.k.name());
    paramParcel.writeStringArray(this.l);
    paramParcel.writeStringArray(this.m);
  }
  
  public static class a
  {
    private Gb a;
    private String b;
    private final LinkedHashSet<Ja> c = new LinkedHashSet(Ja.values().length);
    private String d;
    private String e;
    private jn f;
    private Ia g;
    private boolean h = true;
    private boolean i = true;
    private AccountKitActivity.a j;
    private String[] k;
    private String[] l;
    @Deprecated
    private int m = -1;
    
    public a(Ia paramIa, AccountKitActivity.a parama)
    {
      this.c.add(Ja.b);
      this.c.add(Ja.c);
      this.g = paramIa;
      this.j = parama;
    }
    
    public a a(Fb paramFb)
    {
      this.a = paramFb;
      this.m = -1;
      return this;
    }
    
    public g a()
    {
      Gb localGb = this.a;
      if (localGb == null)
      {
        this.a = new Db(this.m);
      }
      else
      {
        int n = this.m;
        if ((n != -1) && ((localGb instanceof ub))) {
          ((Fb)localGb).a(n);
        }
      }
      localGb = this.a;
      if ((localGb instanceof J)) {
        this.a = new L((J)localGb, this.m);
      }
      return new g((Fb)this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, null);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */