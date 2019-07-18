package com.facebook.accountkit.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.accountkit.ui.Ja;
import fn;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import jn;

public final class ia
  extends X
  implements fn
{
  public static final Parcelable.Creator<ia> CREATOR = new ha();
  private String k;
  private long l;
  private jn m;
  private final Ja n;
  
  private ia(Parcel paramParcel)
  {
    super(paramParcel);
    this.m = ((jn)paramParcel.readParcelable(jn.class.getClassLoader()));
    this.k = paramParcel.readString();
    this.n = Ja.values()[paramParcel.readInt()];
    this.j = new HashMap();
    int i = paramParcel.readInt();
    for (int j = 0; j < i; j++)
    {
      String str1 = paramParcel.readString();
      String str2 = paramParcel.readString();
      this.j.put(str1, str2);
    }
    this.l = paramParcel.readLong();
  }
  
  ia(jn paramjn, Ja paramJa, String paramString)
  {
    super(paramString);
    this.n = paramJa;
    this.m = paramjn;
  }
  
  void b(long paramLong)
  {
    this.l = paramLong;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  void e(String paramString)
  {
    wa.a(l(), Y.b, "Phone status");
    wa.a();
    this.k = paramString;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof ia)) {
      return false;
    }
    paramObject = (ia)paramObject;
    if ((!super.equals(paramObject)) || (!va.a(this.k, ((ia)paramObject).k)) || (!va.a(this.m, ((ia)paramObject).m)) || (this.n != ((ia)paramObject).n) || (this.l != ((ia)paramObject).l)) {
      bool = false;
    }
    return bool;
  }
  
  public long g()
  {
    return this.l;
  }
  
  public jn h()
  {
    return this.m;
  }
  
  public Ja i()
  {
    return this.n;
  }
  
  public String m()
  {
    return this.k;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeParcelable(this.m, paramInt);
    paramParcel.writeString(this.k);
    paramParcel.writeInt(this.n.ordinal());
    paramParcel.writeInt(this.j.size());
    Iterator localIterator = this.j.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramParcel.writeString(str);
      paramParcel.writeString((String)this.j.get(str));
    }
    paramParcel.writeLong(this.l);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/ia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */