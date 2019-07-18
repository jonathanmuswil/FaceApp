package com.google.android.gms.vision;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.nio.ByteBuffer;

public class b
{
  private b a = new b();
  private ByteBuffer b = null;
  private Bitmap c = null;
  
  public Bitmap a()
  {
    return this.c;
  }
  
  public ByteBuffer b()
  {
    Object localObject = this.c;
    if (localObject != null)
    {
      int i = ((Bitmap)localObject).getWidth();
      int j = this.c.getHeight();
      int k = i * j;
      localObject = new int[k];
      this.c.getPixels((int[])localObject, 0, i, 0, 0, i, j);
      byte[] arrayOfByte = new byte[k];
      for (j = 0; j < localObject.length; j++) {
        arrayOfByte[j] = ((byte)(byte)(int)(Color.red(localObject[j]) * 0.299F + Color.green(localObject[j]) * 0.587F + Color.blue(localObject[j]) * 0.114F));
      }
      return ByteBuffer.wrap(arrayOfByte);
    }
    return this.b;
  }
  
  public b c()
  {
    return this.a;
  }
  
  public static class a
  {
    private b a = new b(null);
    
    public a a(int paramInt)
    {
      b.b.d(this.a.c(), paramInt);
      return this;
    }
    
    public a a(long paramLong)
    {
      b.b.a(this.a.c(), paramLong);
      return this;
    }
    
    public a a(Bitmap paramBitmap)
    {
      int i = paramBitmap.getWidth();
      int j = paramBitmap.getHeight();
      b.a(this.a, paramBitmap);
      paramBitmap = this.a.c();
      b.b.a(paramBitmap, i);
      b.b.b(paramBitmap, j);
      return this;
    }
    
    public a a(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3)
    {
      if (paramByteBuffer != null)
      {
        if (paramByteBuffer.capacity() >= paramInt1 * paramInt2)
        {
          if ((paramInt3 != 16) && (paramInt3 != 17) && (paramInt3 != 842094169))
          {
            paramByteBuffer = new StringBuilder(37);
            paramByteBuffer.append("Unsupported image format: ");
            paramByteBuffer.append(paramInt3);
            throw new IllegalArgumentException(paramByteBuffer.toString());
          }
          b.a(this.a, paramByteBuffer);
          paramByteBuffer = this.a.c();
          b.b.a(paramByteBuffer, paramInt1);
          b.b.b(paramByteBuffer, paramInt2);
          b.b.c(paramByteBuffer, paramInt3);
          return this;
        }
        throw new IllegalArgumentException("Invalid image data size.");
      }
      throw new IllegalArgumentException("Null image data supplied.");
    }
    
    public b a()
    {
      if ((b.a(this.a) == null) && (b.b(this.a) == null)) {
        throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
      }
      return this.a;
    }
  }
  
  public static class b
  {
    private int a;
    private int b;
    private int c;
    private long d;
    private int e;
    private int f = -1;
    
    public b() {}
    
    public b(b paramb)
    {
      this.a = paramb.e();
      this.b = paramb.a();
      this.c = paramb.b();
      this.d = paramb.d();
      this.e = paramb.c();
    }
    
    public int a()
    {
      return this.b;
    }
    
    public int b()
    {
      return this.c;
    }
    
    public int c()
    {
      return this.e;
    }
    
    public long d()
    {
      return this.d;
    }
    
    public int e()
    {
      return this.a;
    }
    
    public final void f()
    {
      if (this.e % 2 != 0)
      {
        int i = this.a;
        this.a = this.b;
        this.b = i;
      }
      this.e = 0;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/vision/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */