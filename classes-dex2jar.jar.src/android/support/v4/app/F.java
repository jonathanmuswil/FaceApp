package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;

final class f
  implements Parcelable
{
  public static final Parcelable.Creator<f> CREATOR = new e();
  final int[] a;
  final int b;
  final int c;
  final String d;
  final int e;
  final int f;
  final CharSequence g;
  final int h;
  final CharSequence i;
  final ArrayList<String> j;
  final ArrayList<String> k;
  final boolean l;
  
  public f(Parcel paramParcel)
  {
    this.a = paramParcel.createIntArray();
    this.b = paramParcel.readInt();
    this.c = paramParcel.readInt();
    this.d = paramParcel.readString();
    this.e = paramParcel.readInt();
    this.f = paramParcel.readInt();
    this.g = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.h = paramParcel.readInt();
    this.i = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.j = paramParcel.createStringArrayList();
    this.k = paramParcel.createStringArrayList();
    boolean bool;
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    this.l = bool;
  }
  
  public f(d paramd)
  {
    int m = paramd.b.size();
    this.a = new int[m * 6];
    if (paramd.i)
    {
      int n = 0;
      int i1 = 0;
      while (n < m)
      {
        d.a locala = (d.a)paramd.b.get(n);
        int[] arrayOfInt = this.a;
        int i2 = i1 + 1;
        arrayOfInt[i1] = locala.a;
        int i3 = i2 + 1;
        Object localObject = locala.b;
        if (localObject != null) {
          i1 = ((l)localObject).g;
        } else {
          i1 = -1;
        }
        arrayOfInt[i2] = i1;
        localObject = this.a;
        i1 = i3 + 1;
        localObject[i3] = locala.c;
        i3 = i1 + 1;
        localObject[i1] = locala.d;
        i2 = i3 + 1;
        localObject[i3] = locala.e;
        i1 = i2 + 1;
        localObject[i2] = locala.f;
        n++;
      }
      this.b = paramd.g;
      this.c = paramd.h;
      this.d = paramd.k;
      this.e = paramd.m;
      this.f = paramd.n;
      this.g = paramd.o;
      this.h = paramd.p;
      this.i = paramd.q;
      this.j = paramd.r;
      this.k = paramd.s;
      this.l = paramd.t;
      return;
    }
    throw new IllegalStateException("Not on back stack");
  }
  
  public d a(z paramz)
  {
    d locald = new d(paramz);
    int m = 0;
    int n = 0;
    while (m < this.a.length)
    {
      d.a locala = new d.a();
      Object localObject = this.a;
      int i1 = m + 1;
      locala.a = localObject[m];
      if (z.a)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Instantiate ");
        ((StringBuilder)localObject).append(locald);
        ((StringBuilder)localObject).append(" op #");
        ((StringBuilder)localObject).append(n);
        ((StringBuilder)localObject).append(" base fragment #");
        ((StringBuilder)localObject).append(this.a[i1]);
        Log.v("FragmentManager", ((StringBuilder)localObject).toString());
      }
      localObject = this.a;
      m = i1 + 1;
      i1 = localObject[i1];
      if (i1 >= 0) {
        locala.b = ((l)paramz.k.get(i1));
      } else {
        locala.b = null;
      }
      localObject = this.a;
      i1 = m + 1;
      locala.c = localObject[m];
      m = i1 + 1;
      locala.d = localObject[i1];
      i1 = m + 1;
      locala.e = localObject[m];
      locala.f = localObject[i1];
      locald.c = locala.c;
      locald.d = locala.d;
      locald.e = locala.e;
      locald.f = locala.f;
      locald.a(locala);
      n++;
      m = i1 + 1;
    }
    locald.g = this.b;
    locald.h = this.c;
    locald.k = this.d;
    locald.m = this.e;
    locald.i = true;
    locald.n = this.f;
    locald.o = this.g;
    locald.p = this.h;
    locald.q = this.i;
    locald.r = this.j;
    locald.s = this.k;
    locald.t = this.l;
    locald.a(1);
    return locald;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeIntArray(this.a);
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.f);
    TextUtils.writeToParcel(this.g, paramParcel, 0);
    paramParcel.writeInt(this.h);
    TextUtils.writeToParcel(this.i, paramParcel, 0);
    paramParcel.writeStringList(this.j);
    paramParcel.writeStringList(this.k);
    paramParcel.writeInt(this.l);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/app/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */