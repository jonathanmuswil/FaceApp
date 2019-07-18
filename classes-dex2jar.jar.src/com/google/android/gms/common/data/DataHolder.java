package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.t;
import fq;
import hq;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

@KeepName
public final class DataHolder
  extends fq
  implements Closeable
{
  public static final Parcelable.Creator<DataHolder> CREATOR = new b();
  private static final a a = new a(new String[0], null);
  private final int b;
  private final String[] c;
  private Bundle d;
  private final CursorWindow[] e;
  private final int f;
  private final Bundle g;
  private int[] h;
  private int i;
  private boolean j = false;
  private boolean k = true;
  
  DataHolder(int paramInt1, String[] paramArrayOfString, CursorWindow[] paramArrayOfCursorWindow, int paramInt2, Bundle paramBundle)
  {
    this.b = paramInt1;
    this.c = paramArrayOfString;
    this.e = paramArrayOfCursorWindow;
    this.f = paramInt2;
    this.g = paramBundle;
  }
  
  public final void A()
  {
    this.d = new Bundle();
    int m = 0;
    Object localObject;
    for (int n = 0;; n++)
    {
      localObject = this.c;
      if (n >= localObject.length) {
        break;
      }
      this.d.putInt(localObject[n], n);
    }
    this.h = new int[this.e.length];
    int i1 = 0;
    for (n = m;; n++)
    {
      localObject = this.e;
      if (n >= localObject.length) {
        break;
      }
      this.h[n] = i1;
      m = localObject[n].getStartPosition();
      i1 += this.e[n].getNumRows() - (i1 - m);
    }
    this.i = i1;
  }
  
  public final void close()
  {
    try
    {
      if (!this.j)
      {
        this.j = true;
        for (int m = 0; m < this.e.length; m++) {
          this.e[m].close();
        }
      }
      return;
    }
    finally {}
  }
  
  protected final void finalize()
    throws Throwable
  {
    try
    {
      if ((this.k) && (this.e.length > 0) && (!isClosed()))
      {
        close();
        String str = toString();
        int m = String.valueOf(str).length();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(m + 178);
        localStringBuilder.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
        localStringBuilder.append(str);
        localStringBuilder.append(")");
        Log.e("DataBuffer", localStringBuilder.toString());
      }
      return;
    }
    finally
    {
      super.finalize();
    }
  }
  
  public final boolean isClosed()
  {
    try
    {
      boolean bool = this.j;
      return bool;
    }
    finally {}
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int m = hq.a(paramParcel);
    hq.a(paramParcel, 1, this.c, false);
    hq.a(paramParcel, 2, this.e, paramInt, false);
    hq.a(paramParcel, 3, z());
    hq.a(paramParcel, 4, y(), false);
    hq.a(paramParcel, 1000, this.b);
    hq.a(paramParcel, m);
    if ((paramInt & 0x1) != 0) {
      close();
    }
  }
  
  public final Bundle y()
  {
    return this.g;
  }
  
  public final int z()
  {
    return this.f;
  }
  
  public static class a
  {
    private final String[] a;
    private final ArrayList<HashMap<String, Object>> b;
    private final String c;
    private final HashMap<Object, Integer> d;
    private boolean e;
    private String f;
    
    private a(String[] paramArrayOfString, String paramString)
    {
      t.a(paramArrayOfString);
      this.a = ((String[])paramArrayOfString);
      this.b = new ArrayList();
      this.c = paramString;
      this.d = new HashMap();
      this.e = false;
      this.f = null;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/data/DataHolder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */