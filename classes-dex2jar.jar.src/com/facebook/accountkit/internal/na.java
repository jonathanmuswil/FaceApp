package com.facebook.accountkit.internal;

import Vm;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import jn;
import kn;

final class na
  implements kn
{
  public static final Parcelable.Creator<na> CREATOR = new ma();
  private jn a;
  private long b;
  private long c;
  private String d;
  private String e;
  private String f;
  private String g;
  private ta h = ta.a;
  private Vm i;
  private Map<String, String> j = new HashMap();
  
  private na(Parcel paramParcel)
  {
    this.a = ((jn)paramParcel.readParcelable(jn.class.getClassLoader()));
    this.b = paramParcel.readLong();
    this.c = paramParcel.readLong();
    this.d = paramParcel.readString();
    this.e = paramParcel.readString();
    this.g = paramParcel.readString();
    this.i = ((Vm)paramParcel.readParcelable(Vm.class.getClassLoader()));
    this.h = ta.valueOf(paramParcel.readString());
    this.j = new HashMap();
    int k = paramParcel.readInt();
    for (int m = 0; m < k; m++)
    {
      String str1 = paramParcel.readString();
      String str2 = paramParcel.readString();
      this.j.put(str1, str2);
    }
  }
  
  na(jn paramjn)
  {
    this.a = paramjn;
  }
  
  public String a()
  {
    return this.d;
  }
  
  void a(long paramLong)
  {
    this.c = paramLong;
  }
  
  void a(Vm paramVm)
  {
    this.i = paramVm;
  }
  
  void a(ta paramta)
  {
    this.h = paramta;
  }
  
  void a(String paramString)
  {
    wa.a(e(), ta.b, "Phone status");
    wa.a();
    this.d = paramString;
  }
  
  void a(String paramString1, String paramString2)
  {
    this.j.put(paramString1, paramString2);
  }
  
  public Vm b()
  {
    return this.i;
  }
  
  void b(long paramLong)
  {
    this.b = paramLong;
  }
  
  void b(String paramString)
  {
    this.g = paramString;
  }
  
  public String c()
  {
    return this.g;
  }
  
  void c(String paramString)
  {
    this.f = paramString;
  }
  
  public jn d()
  {
    return this.a;
  }
  
  void d(String paramString)
  {
    this.e = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public ta e()
  {
    return this.h;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof na)) {
      return false;
    }
    paramObject = (na)paramObject;
    if ((this.c != ((na)paramObject).c) || (this.b != ((na)paramObject).b) || (!va.a(this.i, ((na)paramObject).i)) || (!va.a(this.h, ((na)paramObject).h)) || (!va.a(this.a, ((na)paramObject).a)) || (!va.a(this.e, ((na)paramObject).e)) || (!va.a(this.g, ((na)paramObject).g)) || (!va.a(this.d, ((na)paramObject).d))) {
      bool = false;
    }
    return bool;
  }
  
  public String f()
  {
    return this.e;
  }
  
  public int hashCode()
  {
    return (((((((527 + this.a.hashCode()) * 31 + Long.valueOf(this.b).hashCode()) * 31 + Long.valueOf(this.c).hashCode()) * 31 + this.i.hashCode()) * 31 + this.h.hashCode()) * 31 + this.e.hashCode()) * 31 + this.g.hashCode()) * 31 + this.d.hashCode();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.a, paramInt);
    paramParcel.writeLong(this.b);
    paramParcel.writeLong(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeString(this.e);
    paramParcel.writeString(this.g);
    paramParcel.writeParcelable(this.i, paramInt);
    paramParcel.writeString(this.h.name());
    paramParcel.writeInt(this.j.size());
    Iterator localIterator = this.j.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramParcel.writeString(str);
      paramParcel.writeString((String)this.j.get(str));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/na.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */