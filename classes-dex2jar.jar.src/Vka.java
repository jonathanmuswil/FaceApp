import android.annotation.SuppressLint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@SuppressLint({"ParcelCreator"})
public final class vka
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new vka.b();
  public static final vka.a a = new vka.a(null);
  private final String b;
  private final float c;
  private final uka d;
  private final VOa e;
  private final String f;
  private final float g;
  private final float h;
  private final float i;
  private final float j;
  
  public vka(String paramString1, float paramFloat1, uka paramuka, VOa paramVOa, String paramString2, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    this.b = paramString1;
    this.c = paramFloat1;
    this.d = paramuka;
    this.e = paramVOa;
    this.f = paramString2;
    this.g = paramFloat2;
    this.h = paramFloat3;
    this.i = paramFloat4;
    this.j = paramFloat5;
  }
  
  public final RectF a(APa paramAPa)
  {
    oXa.b(paramAPa, "imageSize");
    return new RectF(paramAPa.c() * this.g, paramAPa.b() * this.h, paramAPa.c() * this.i, paramAPa.b() * this.j);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof vka))
      {
        paramObject = (vka)paramObject;
        if ((oXa.a(this.b, ((vka)paramObject).b)) && (Float.compare(this.c, ((vka)paramObject).c) == 0) && (oXa.a(this.d, ((vka)paramObject).d)) && (oXa.a(this.e, ((vka)paramObject).e)) && (oXa.a(this.f, ((vka)paramObject).f)) && (Float.compare(this.g, ((vka)paramObject).g) == 0) && (Float.compare(this.h, ((vka)paramObject).h) == 0) && (Float.compare(this.i, ((vka)paramObject).i) == 0) && (Float.compare(this.j, ((vka)paramObject).j) == 0)) {}
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public int hashCode()
  {
    Object localObject = this.b;
    int k = 0;
    int m;
    if (localObject != null) {
      m = ((String)localObject).hashCode();
    } else {
      m = 0;
    }
    int n = Float.floatToIntBits(this.c);
    localObject = this.d;
    int i1;
    if (localObject != null) {
      i1 = ((uka)localObject).hashCode();
    } else {
      i1 = 0;
    }
    localObject = this.e;
    int i2;
    if (localObject != null) {
      i2 = ((Enum)localObject).hashCode();
    } else {
      i2 = 0;
    }
    localObject = this.f;
    if (localObject != null) {
      k = ((String)localObject).hashCode();
    }
    return (((((((m * 31 + n) * 31 + i1) * 31 + i2) * 31 + k) * 31 + Float.floatToIntBits(this.g)) * 31 + Float.floatToIntBits(this.h)) * 31 + Float.floatToIntBits(this.i)) * 31 + Float.floatToIntBits(this.j);
  }
  
  public final uka l()
  {
    return this.d;
  }
  
  public final VOa m()
  {
    return this.e;
  }
  
  public final String n()
  {
    return this.b;
  }
  
  public final String o()
  {
    return this.f;
  }
  
  public final float p()
  {
    return this.c;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Face(id=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", stylistRatio=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", eyes=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", gender=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(", sourceRegionId=");
    localStringBuilder.append(this.f);
    localStringBuilder.append(", left=");
    localStringBuilder.append(this.g);
    localStringBuilder.append(", top=");
    localStringBuilder.append(this.h);
    localStringBuilder.append(", right=");
    localStringBuilder.append(this.i);
    localStringBuilder.append(", bottom=");
    localStringBuilder.append(this.j);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    oXa.b(paramParcel, "parcel");
    paramParcel.writeString(this.b);
    paramParcel.writeFloat(this.c);
    this.d.writeToParcel(paramParcel, 0);
    paramParcel.writeString(this.e.name());
    paramParcel.writeString(this.f);
    paramParcel.writeFloat(this.g);
    paramParcel.writeFloat(this.h);
    paramParcel.writeFloat(this.i);
    paramParcel.writeFloat(this.j);
  }
  
  public static final class a
  {
    public final vka a(qZ paramqZ)
    {
      oXa.b(paramqZ, "data");
      String str = paramqZ.m();
      oXa.a(str, "data.id");
      float f1 = paramqZ.p();
      Object localObject1 = uka.a;
      Object localObject2 = paramqZ.k();
      oXa.a(localObject2, "data.eyes");
      localObject1 = ((uka.a)localObject1).a((qZ.b)localObject2);
      localObject2 = VOa.e;
      Object localObject3 = paramqZ.l();
      oXa.a(localObject3, "data.gender");
      localObject2 = ((VOa.a)localObject2).a((OZ)localObject3);
      localObject3 = paramqZ.o();
      oXa.a(localObject3, "data.sourceRegionId");
      localObject3 = EPa.b((String)localObject3);
      oZ localoZ = paramqZ.n();
      oXa.a(localoZ, "data.rectangle");
      float f2 = localoZ.m();
      localoZ = paramqZ.n();
      oXa.a(localoZ, "data.rectangle");
      float f3 = localoZ.o();
      localoZ = paramqZ.n();
      oXa.a(localoZ, "data.rectangle");
      float f4 = localoZ.n();
      paramqZ = paramqZ.n();
      oXa.a(paramqZ, "data.rectangle");
      return new vka(str, f1, (uka)localObject1, (VOa)localObject2, (String)localObject3, f2, f3, f4, paramqZ.k());
    }
  }
  
  public static final class b
    implements Parcelable.Creator
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      oXa.b(paramParcel, "in");
      return new vka(paramParcel.readString(), paramParcel.readFloat(), (uka)uka.CREATOR.createFromParcel(paramParcel), (VOa)Enum.valueOf(VOa.class, paramParcel.readString()), paramParcel.readString(), paramParcel.readFloat(), paramParcel.readFloat(), paramParcel.readFloat(), paramParcel.readFloat());
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new vka[paramInt];
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/vka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */