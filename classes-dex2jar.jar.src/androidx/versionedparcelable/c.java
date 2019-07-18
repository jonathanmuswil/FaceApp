package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;

class c
  extends b
{
  private final SparseIntArray a = new SparseIntArray();
  private final Parcel b;
  private final int c;
  private final int d;
  private final String e;
  private int f = -1;
  private int g = 0;
  
  c(Parcel paramParcel)
  {
    this(paramParcel, paramParcel.dataPosition(), paramParcel.dataSize(), "");
  }
  
  c(Parcel paramParcel, int paramInt1, int paramInt2, String paramString)
  {
    this.b = paramParcel;
    this.c = paramInt1;
    this.d = paramInt2;
    this.g = this.c;
    this.e = paramString;
  }
  
  private int d(int paramInt)
  {
    int j;
    do
    {
      int i = this.g;
      if (i >= this.d) {
        break;
      }
      this.b.setDataPosition(i);
      i = this.b.readInt();
      j = this.b.readInt();
      this.g += i;
    } while (j != paramInt);
    return this.b.dataPosition();
    return -1;
  }
  
  public void a()
  {
    int i = this.f;
    if (i >= 0)
    {
      int j = this.a.get(i);
      i = this.b.dataPosition();
      this.b.setDataPosition(j);
      this.b.writeInt(i - j);
      this.b.setDataPosition(i);
    }
  }
  
  public void a(Parcelable paramParcelable)
  {
    this.b.writeParcelable(paramParcelable, 0);
  }
  
  public void a(String paramString)
  {
    this.b.writeString(paramString);
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null)
    {
      this.b.writeInt(paramArrayOfByte.length);
      this.b.writeByteArray(paramArrayOfByte);
    }
    else
    {
      this.b.writeInt(-1);
    }
  }
  
  public boolean a(int paramInt)
  {
    paramInt = d(paramInt);
    if (paramInt == -1) {
      return false;
    }
    this.b.setDataPosition(paramInt);
    return true;
  }
  
  protected b b()
  {
    Parcel localParcel = this.b;
    int i = localParcel.dataPosition();
    int j = this.g;
    int k = j;
    if (j == this.c) {
      k = this.d;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.e);
    localStringBuilder.append("  ");
    return new c(localParcel, i, k, localStringBuilder.toString());
  }
  
  public void b(int paramInt)
  {
    a();
    this.f = paramInt;
    this.a.put(paramInt, this.b.dataPosition());
    c(0);
    c(paramInt);
  }
  
  public void c(int paramInt)
  {
    this.b.writeInt(paramInt);
  }
  
  public byte[] d()
  {
    int i = this.b.readInt();
    if (i < 0) {
      return null;
    }
    byte[] arrayOfByte = new byte[i];
    this.b.readByteArray(arrayOfByte);
    return arrayOfByte;
  }
  
  public int e()
  {
    return this.b.readInt();
  }
  
  public <T extends Parcelable> T f()
  {
    return this.b.readParcelable(c.class.getClassLoader());
  }
  
  public String g()
  {
    return this.b.readString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/androidx/versionedparcelable/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */