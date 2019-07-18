package com.theartofdev.edmodo.cropper;

import Va;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

final class c
{
  static final Rect a = new Rect();
  static final RectF b = new RectF();
  static final RectF c = new RectF();
  static final float[] d = new float[6];
  static final float[] e = new float[6];
  private static int f;
  static Pair<String, WeakReference<Bitmap>> g;
  
  static float a(float[] paramArrayOfFloat)
  {
    return Math.max(Math.max(Math.max(paramArrayOfFloat[1], paramArrayOfFloat[3]), paramArrayOfFloat[5]), paramArrayOfFloat[7]);
  }
  
  private static int a()
  {
    i = 2048;
    try
    {
      EGL10 localEGL10 = (EGL10)EGLContext.getEGL();
      EGLDisplay localEGLDisplay = localEGL10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
      localEGL10.eglInitialize(localEGLDisplay, new int[2]);
      int[] arrayOfInt1 = new int[1];
      localEGL10.eglGetConfigs(localEGLDisplay, null, 0, arrayOfInt1);
      EGLConfig[] arrayOfEGLConfig = new EGLConfig[arrayOfInt1[0]];
      localEGL10.eglGetConfigs(localEGLDisplay, arrayOfEGLConfig, arrayOfInt1[0], arrayOfInt1);
      int[] arrayOfInt2 = new int[1];
      int j = 0;
      int m;
      for (k = 0; j < arrayOfInt1[0]; k = m)
      {
        localEGL10.eglGetConfigAttrib(localEGLDisplay, arrayOfEGLConfig[j], 12332, arrayOfInt2);
        m = k;
        if (k < arrayOfInt2[0]) {
          m = arrayOfInt2[0];
        }
        j++;
      }
      localEGL10.eglTerminate(localEGLDisplay);
      k = Math.max(k, 2048);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        int k = i;
      }
    }
    return k;
  }
  
  private static int a(int paramInt1, int paramInt2)
  {
    if (f == 0) {
      f = a();
    }
    int i = f;
    int j = 1;
    int k = 1;
    if (i > 0) {
      for (;;)
      {
        j = paramInt2 / k;
        i = f;
        if (j <= i)
        {
          j = k;
          if (paramInt1 / k <= i) {
            break;
          }
        }
        k *= 2;
      }
    }
    return j;
  }
  
  private static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 1;
    int j = 1;
    int k = j;
    if (paramInt2 <= paramInt4)
    {
      if (paramInt1 > paramInt3) {
        k = j;
      }
    }
    else {
      for (;;)
      {
        i = k;
        if (paramInt2 / 2 / k <= paramInt4) {
          break;
        }
        i = k;
        if (paramInt1 / 2 / k <= paramInt3) {
          break;
        }
        k *= 2;
      }
    }
    return i;
  }
  
  /* Error */
  private static Bitmap a(ContentResolver paramContentResolver, Uri paramUri, BitmapFactory.Options paramOptions)
    throws FileNotFoundException
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: aload_0
    //   6: aload_1
    //   7: invokevirtual 105	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   10: astore 5
    //   12: aload 5
    //   14: astore 4
    //   16: aload 5
    //   18: astore_3
    //   19: aload 5
    //   21: getstatic 30	com/theartofdev/edmodo/cropper/c:a	Landroid/graphics/Rect;
    //   24: aload_2
    //   25: invokestatic 111	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   28: astore 6
    //   30: aload 5
    //   32: invokestatic 114	com/theartofdev/edmodo/cropper/c:a	(Ljava/io/Closeable;)V
    //   35: aload 6
    //   37: areturn
    //   38: astore_0
    //   39: goto +68 -> 107
    //   42: astore 4
    //   44: aload_3
    //   45: astore 4
    //   47: aload_2
    //   48: aload_2
    //   49: getfield 119	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   52: iconst_2
    //   53: imul
    //   54: putfield 119	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   57: aload_3
    //   58: invokestatic 114	com/theartofdev/edmodo/cropper/c:a	(Ljava/io/Closeable;)V
    //   61: aload_2
    //   62: getfield 119	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   65: sipush 512
    //   68: if_icmpgt +6 -> 74
    //   71: goto -71 -> 0
    //   74: new 121	java/lang/StringBuilder
    //   77: dup
    //   78: invokespecial 122	java/lang/StringBuilder:<init>	()V
    //   81: astore_0
    //   82: aload_0
    //   83: ldc 124
    //   85: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: pop
    //   89: aload_0
    //   90: aload_1
    //   91: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   94: pop
    //   95: new 133	java/lang/RuntimeException
    //   98: dup
    //   99: aload_0
    //   100: invokevirtual 137	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   103: invokespecial 140	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   106: athrow
    //   107: aload 4
    //   109: invokestatic 114	com/theartofdev/edmodo/cropper/c:a	(Ljava/io/Closeable;)V
    //   112: aload_0
    //   113: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	paramContentResolver	ContentResolver
    //   0	114	1	paramUri	Uri
    //   0	114	2	paramOptions	BitmapFactory.Options
    //   1	57	3	localObject1	Object
    //   3	12	4	localObject2	Object
    //   42	1	4	localOutOfMemoryError	OutOfMemoryError
    //   45	63	4	localObject3	Object
    //   10	21	5	localInputStream	InputStream
    //   28	8	6	localBitmap	Bitmap
    // Exception table:
    //   from	to	target	type
    //   5	12	38	finally
    //   19	30	38	finally
    //   47	57	38	finally
    //   5	12	42	java/lang/OutOfMemoryError
    //   19	30	42	java/lang/OutOfMemoryError
  }
  
  static Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2, CropImageView.i parami)
  {
    if ((paramInt1 > 0) && (paramInt2 > 0)) {
      try
      {
        if ((parami == CropImageView.i.d) || (parami == CropImageView.i.c) || (parami == CropImageView.i.e))
        {
          Bitmap localBitmap = null;
          if (parami == CropImageView.i.e)
          {
            localBitmap = Bitmap.createScaledBitmap(paramBitmap, paramInt1, paramInt2, false);
          }
          else
          {
            int i = paramBitmap.getWidth();
            int j = paramBitmap.getHeight();
            float f1 = i;
            float f2 = f1 / paramInt1;
            float f3 = j;
            f2 = Math.max(f2, f3 / paramInt2);
            if ((f2 > 1.0F) || (parami == CropImageView.i.d)) {
              localBitmap = Bitmap.createScaledBitmap(paramBitmap, (int)(f1 / f2), (int)(f3 / f2), false);
            }
          }
          if (localBitmap != null)
          {
            if (localBitmap != paramBitmap) {
              paramBitmap.recycle();
            }
            return localBitmap;
          }
        }
      }
      catch (Exception parami)
      {
        Log.w("AIC", "Failed to resize cropped image, return bitmap before resize", parami);
      }
    }
    return paramBitmap;
  }
  
  private static Bitmap a(Bitmap paramBitmap, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramInt <= 0) && (!paramBoolean1) && (!paramBoolean2)) {
      return paramBitmap;
    }
    Object localObject = new Matrix();
    ((Matrix)localObject).setRotate(paramInt);
    float f1 = -1.0F;
    float f2;
    if (paramBoolean1) {
      f2 = -1.0F;
    } else {
      f2 = 1.0F;
    }
    if (!paramBoolean2) {
      f1 = 1.0F;
    }
    ((Matrix)localObject).postScale(f2, f1);
    localObject = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), (Matrix)localObject, false);
    if (localObject != paramBitmap) {
      paramBitmap.recycle();
    }
    return (Bitmap)localObject;
  }
  
  private static Bitmap a(Bitmap paramBitmap, float[] paramArrayOfFloat, int paramInt1, boolean paramBoolean1, int paramInt2, int paramInt3, float paramFloat, boolean paramBoolean2, boolean paramBoolean3)
  {
    Rect localRect = a(paramArrayOfFloat, paramBitmap.getWidth(), paramBitmap.getHeight(), paramBoolean1, paramInt2, paramInt3);
    Object localObject = new Matrix();
    ((Matrix)localObject).setRotate(paramInt1, paramBitmap.getWidth() / 2, paramBitmap.getHeight() / 2);
    float f1;
    if (paramBoolean2) {
      f1 = -paramFloat;
    } else {
      f1 = paramFloat;
    }
    float f2 = paramFloat;
    if (paramBoolean3) {
      f2 = -paramFloat;
    }
    ((Matrix)localObject).postScale(f1, f2);
    Bitmap localBitmap = Bitmap.createBitmap(paramBitmap, localRect.left, localRect.top, localRect.width(), localRect.height(), (Matrix)localObject, true);
    localObject = localBitmap;
    if (localBitmap == paramBitmap) {
      localObject = paramBitmap.copy(paramBitmap.getConfig(), false);
    }
    paramBitmap = (Bitmap)localObject;
    if (paramInt1 % 90 != 0) {
      paramBitmap = a((Bitmap)localObject, paramArrayOfFloat, localRect, paramInt1, paramBoolean1, paramInt2, paramInt3);
    }
    return paramBitmap;
  }
  
  private static Bitmap a(Bitmap paramBitmap, float[] paramArrayOfFloat, Rect paramRect, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
  {
    Bitmap localBitmap = paramBitmap;
    if (paramInt1 % 90 != 0)
    {
      double d1 = Math.toRadians(paramInt1);
      if ((paramInt1 >= 90) && ((paramInt1 <= 180) || (paramInt1 >= 270))) {
        paramInt1 = paramRect.right;
      } else {
        paramInt1 = paramRect.left;
      }
      int i = 0;
      for (int j = 0; j < paramArrayOfFloat.length; j += 2) {
        if ((paramArrayOfFloat[j] >= paramInt1 - 1) && (paramArrayOfFloat[j] <= paramInt1 + 1))
        {
          double d2 = Math.sin(d1);
          float f1 = paramRect.bottom;
          j++;
          i = (int)Math.abs(d2 * (f1 - paramArrayOfFloat[j]));
          paramInt1 = (int)Math.abs(Math.cos(d1) * (paramArrayOfFloat[j] - paramRect.top));
          k = (int)Math.abs((paramArrayOfFloat[j] - paramRect.top) / Math.sin(d1));
          j = (int)Math.abs((paramRect.bottom - paramArrayOfFloat[j]) / Math.cos(d1));
          break label209;
        }
      }
      j = 0;
      paramInt1 = 0;
      int k = 0;
      label209:
      paramRect.set(i, paramInt1, k + i, j + paramInt1);
      if (paramBoolean) {
        a(paramRect, paramInt2, paramInt3);
      }
      localBitmap = Bitmap.createBitmap(paramBitmap, paramRect.left, paramRect.top, paramRect.width(), paramRect.height());
      if (paramBitmap != localBitmap) {
        paramBitmap.recycle();
      }
    }
    return localBitmap;
  }
  
  /* Error */
  private static BitmapFactory.Options a(ContentResolver paramContentResolver, Uri paramUri)
    throws FileNotFoundException
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 105	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   5: astore_0
    //   6: new 116	android/graphics/BitmapFactory$Options
    //   9: astore_1
    //   10: aload_1
    //   11: invokespecial 254	android/graphics/BitmapFactory$Options:<init>	()V
    //   14: aload_1
    //   15: iconst_1
    //   16: putfield 258	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   19: aload_0
    //   20: getstatic 30	com/theartofdev/edmodo/cropper/c:a	Landroid/graphics/Rect;
    //   23: aload_1
    //   24: invokestatic 111	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   27: pop
    //   28: aload_1
    //   29: iconst_0
    //   30: putfield 258	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   33: aload_0
    //   34: invokestatic 114	com/theartofdev/edmodo/cropper/c:a	(Ljava/io/Closeable;)V
    //   37: aload_1
    //   38: areturn
    //   39: astore_1
    //   40: goto +6 -> 46
    //   43: astore_1
    //   44: aconst_null
    //   45: astore_0
    //   46: aload_0
    //   47: invokestatic 114	com/theartofdev/edmodo/cropper/c:a	(Ljava/io/Closeable;)V
    //   50: aload_1
    //   51: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	52	0	paramContentResolver	ContentResolver
    //   0	52	1	paramUri	Uri
    // Exception table:
    //   from	to	target	type
    //   6	33	39	finally
    //   0	6	43	finally
  }
  
  static Rect a(float[] paramArrayOfFloat, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4)
  {
    paramArrayOfFloat = new Rect(Math.round(Math.max(0.0F, e(paramArrayOfFloat))), Math.round(Math.max(0.0F, g(paramArrayOfFloat))), Math.round(Math.min(paramInt1, f(paramArrayOfFloat))), Math.round(Math.min(paramInt2, a(paramArrayOfFloat))));
    if (paramBoolean) {
      a(paramArrayOfFloat, paramInt3, paramInt4);
    }
    return paramArrayOfFloat;
  }
  
  static Uri a(Context paramContext, Bitmap paramBitmap, Uri paramUri)
  {
    int i = 1;
    if (paramUri == null) {}
    try
    {
      Uri localUri = Uri.fromFile(File.createTempFile("aic_state_store_temp", ".jpg", paramContext.getCacheDir()));
      break label57;
      File localFile = new java/io/File;
      localFile.<init>(paramUri.getPath());
      localUri = paramUri;
      if (localFile.exists())
      {
        i = 0;
        localUri = paramUri;
      }
      label57:
      if (i != 0) {
        a(paramContext, paramBitmap, localUri, Bitmap.CompressFormat.JPEG, 95);
      }
      return localUri;
    }
    catch (Exception paramContext)
    {
      Log.w("AIC", "Failed to write bitmap to temp file for image-cropper save instance state", paramContext);
    }
    return null;
  }
  
  static a a(Context paramContext, Uri paramUri, int paramInt1, int paramInt2)
  {
    try
    {
      localObject = paramContext.getContentResolver();
      paramContext = a((ContentResolver)localObject, paramUri);
      paramContext.inSampleSize = Math.max(a(paramContext.outWidth, paramContext.outHeight, paramInt1, paramInt2), a(paramContext.outWidth, paramContext.outHeight));
      paramContext = new a(a((ContentResolver)localObject, paramUri, paramContext), paramContext.inSampleSize);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Failed to load sampled bitmap: ");
      ((StringBuilder)localObject).append(paramUri);
      ((StringBuilder)localObject).append("\r\n");
      ((StringBuilder)localObject).append(paramContext.getMessage());
      throw new RuntimeException(((StringBuilder)localObject).toString(), paramContext);
    }
  }
  
  /* Error */
  private static a a(Context paramContext, Uri paramUri, Rect paramRect, int paramInt1, int paramInt2, int paramInt3)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aconst_null
    //   4: astore 7
    //   6: new 116	android/graphics/BitmapFactory$Options
    //   9: astore 8
    //   11: aload 8
    //   13: invokespecial 254	android/graphics/BitmapFactory$Options:<init>	()V
    //   16: aload 8
    //   18: iload 5
    //   20: aload_2
    //   21: invokevirtual 209	android/graphics/Rect:width	()I
    //   24: aload_2
    //   25: invokevirtual 212	android/graphics/Rect:height	()I
    //   28: iload_3
    //   29: iload 4
    //   31: invokestatic 332	com/theartofdev/edmodo/cropper/c:a	(IIII)I
    //   34: imul
    //   35: putfield 119	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   38: aload_0
    //   39: invokevirtual 322	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   42: aload_1
    //   43: invokevirtual 105	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   46: astore 9
    //   48: aload 9
    //   50: iconst_0
    //   51: invokestatic 356	android/graphics/BitmapRegionDecoder:newInstance	(Ljava/io/InputStream;Z)Landroid/graphics/BitmapRegionDecoder;
    //   54: astore_0
    //   55: new 6	com/theartofdev/edmodo/cropper/c$a
    //   58: dup
    //   59: aload_0
    //   60: aload_2
    //   61: aload 8
    //   63: invokevirtual 360	android/graphics/BitmapRegionDecoder:decodeRegion	(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   66: aload 8
    //   68: getfield 119	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   71: invokespecial 339	com/theartofdev/edmodo/cropper/c$a:<init>	(Landroid/graphics/Bitmap;I)V
    //   74: astore 6
    //   76: aload 9
    //   78: invokestatic 114	com/theartofdev/edmodo/cropper/c:a	(Ljava/io/Closeable;)V
    //   81: aload_0
    //   82: ifnull +7 -> 89
    //   85: aload_0
    //   86: invokevirtual 361	android/graphics/BitmapRegionDecoder:recycle	()V
    //   89: aload 6
    //   91: areturn
    //   92: astore_2
    //   93: goto +63 -> 156
    //   96: astore 6
    //   98: aload_0
    //   99: astore_2
    //   100: goto +69 -> 169
    //   103: astore 6
    //   105: aload 8
    //   107: aload 8
    //   109: getfield 119	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   112: iconst_2
    //   113: imul
    //   114: putfield 119	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   117: aload 8
    //   119: getfield 119	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   122: istore_3
    //   123: iload_3
    //   124: sipush 512
    //   127: if_icmple -72 -> 55
    //   130: aload 9
    //   132: invokestatic 114	com/theartofdev/edmodo/cropper/c:a	(Ljava/io/Closeable;)V
    //   135: aload_0
    //   136: ifnull +7 -> 143
    //   139: aload_0
    //   140: invokevirtual 361	android/graphics/BitmapRegionDecoder:recycle	()V
    //   143: new 6	com/theartofdev/edmodo/cropper/c$a
    //   146: dup
    //   147: aconst_null
    //   148: iconst_1
    //   149: invokespecial 339	com/theartofdev/edmodo/cropper/c$a:<init>	(Landroid/graphics/Bitmap;I)V
    //   152: areturn
    //   153: astore_2
    //   154: aconst_null
    //   155: astore_0
    //   156: aload 9
    //   158: astore_1
    //   159: aload_0
    //   160: astore 6
    //   162: goto +106 -> 268
    //   165: astore 6
    //   167: aconst_null
    //   168: astore_2
    //   169: aload 9
    //   171: astore_0
    //   172: goto +22 -> 194
    //   175: astore_2
    //   176: aconst_null
    //   177: astore_0
    //   178: aload 6
    //   180: astore_1
    //   181: aload_0
    //   182: astore 6
    //   184: goto +84 -> 268
    //   187: astore 6
    //   189: aconst_null
    //   190: astore_2
    //   191: aload 7
    //   193: astore_0
    //   194: new 133	java/lang/RuntimeException
    //   197: astore 9
    //   199: new 121	java/lang/StringBuilder
    //   202: astore 7
    //   204: aload 7
    //   206: invokespecial 122	java/lang/StringBuilder:<init>	()V
    //   209: aload 7
    //   211: ldc_w 341
    //   214: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   217: pop
    //   218: aload 7
    //   220: aload_1
    //   221: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   224: pop
    //   225: aload 7
    //   227: ldc_w 343
    //   230: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: pop
    //   234: aload 7
    //   236: aload 6
    //   238: invokevirtual 346	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   241: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   244: pop
    //   245: aload 9
    //   247: aload 7
    //   249: invokevirtual 137	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   252: aload 6
    //   254: invokespecial 349	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   257: aload 9
    //   259: athrow
    //   260: astore_1
    //   261: aload_2
    //   262: astore 6
    //   264: aload_1
    //   265: astore_2
    //   266: aload_0
    //   267: astore_1
    //   268: aload_1
    //   269: invokestatic 114	com/theartofdev/edmodo/cropper/c:a	(Ljava/io/Closeable;)V
    //   272: aload 6
    //   274: ifnull +8 -> 282
    //   277: aload 6
    //   279: invokevirtual 361	android/graphics/BitmapRegionDecoder:recycle	()V
    //   282: aload_2
    //   283: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	284	0	paramContext	Context
    //   0	284	1	paramUri	Uri
    //   0	284	2	paramRect	Rect
    //   0	284	3	paramInt1	int
    //   0	284	4	paramInt2	int
    //   0	284	5	paramInt3	int
    //   1	89	6	locala	a
    //   96	1	6	localException1	Exception
    //   103	1	6	localOutOfMemoryError	OutOfMemoryError
    //   160	1	6	localContext1	Context
    //   165	14	6	localException2	Exception
    //   182	1	6	localContext2	Context
    //   187	66	6	localException3	Exception
    //   262	16	6	localRect	Rect
    //   4	244	7	localStringBuilder	StringBuilder
    //   9	109	8	localOptions	BitmapFactory.Options
    //   46	212	9	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   55	76	92	finally
    //   105	123	92	finally
    //   55	76	96	java/lang/Exception
    //   105	123	96	java/lang/Exception
    //   55	76	103	java/lang/OutOfMemoryError
    //   48	55	153	finally
    //   48	55	165	java/lang/Exception
    //   6	48	175	finally
    //   6	48	187	java/lang/Exception
    //   194	260	260	finally
  }
  
  static a a(Context paramContext, Uri paramUri, float[] paramArrayOfFloat, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean2, boolean paramBoolean3)
  {
    int i = 1;
    do
    {
      try
      {
        a locala = a(paramContext, paramUri, paramArrayOfFloat, paramInt1, paramInt2, paramInt3, paramBoolean1, paramInt4, paramInt5, paramInt6, paramInt7, paramBoolean2, paramBoolean3, i);
        return locala;
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        i *= 2;
      }
    } while (i <= 16);
    paramContext = new StringBuilder();
    paramContext.append("Failed to handle OOM by sampling (");
    paramContext.append(i);
    paramContext.append("): ");
    paramContext.append(paramUri);
    paramContext.append("\r\n");
    paramContext.append(localOutOfMemoryError.getMessage());
    throw new RuntimeException(paramContext.toString(), localOutOfMemoryError);
  }
  
  private static a a(Context paramContext, Uri paramUri, float[] paramArrayOfFloat, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean2, boolean paramBoolean3, int paramInt8)
  {
    Rect localRect = a(paramArrayOfFloat, paramInt2, paramInt3, paramBoolean1, paramInt4, paramInt5);
    if (paramInt6 > 0) {
      paramInt2 = paramInt6;
    } else {
      paramInt2 = localRect.width();
    }
    if (paramInt7 > 0) {
      paramInt3 = paramInt7;
    } else {
      paramInt3 = localRect.height();
    }
    Bitmap localBitmap1 = null;
    paramInt7 = 1;
    Bitmap localBitmap2 = localBitmap1;
    try
    {
      a locala = a(paramContext, paramUri, localRect, paramInt2, paramInt3, paramInt8);
      localBitmap2 = localBitmap1;
      localBitmap1 = locala.a;
      localBitmap2 = localBitmap1;
      paramInt6 = locala.b;
      localBitmap2 = localBitmap1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        label176:
        paramInt6 = paramInt7;
      }
    }
    if (localBitmap2 != null)
    {
      try
      {
        paramContext = a(localBitmap2, paramInt1, paramBoolean2, paramBoolean3);
        paramUri = paramContext;
        if (paramInt1 % 90 != 0) {}
        try
        {
          paramUri = a(paramContext, paramArrayOfFloat, localRect, paramInt1, paramBoolean1, paramInt4, paramInt5);
          return new a(paramUri, paramInt6);
        }
        catch (OutOfMemoryError paramUri)
        {
          paramArrayOfFloat = paramContext;
        }
        if (paramArrayOfFloat == null) {
          break label176;
        }
      }
      catch (OutOfMemoryError paramContext)
      {
        paramArrayOfFloat = localBitmap2;
        paramUri = paramContext;
      }
      paramArrayOfFloat.recycle();
      throw paramUri;
    }
    return a(paramContext, paramUri, paramArrayOfFloat, paramInt1, paramBoolean1, paramInt4, paramInt5, paramInt8, localRect, paramInt2, paramInt3, paramBoolean2, paramBoolean3);
  }
  
  private static a a(Context paramContext, Uri paramUri, float[] paramArrayOfFloat, int paramInt1, boolean paramBoolean1, int paramInt2, int paramInt3, int paramInt4, Rect paramRect, int paramInt5, int paramInt6, boolean paramBoolean2, boolean paramBoolean3)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = localObject1;
    try
    {
      BitmapFactory.Options localOptions = new android/graphics/BitmapFactory$Options;
      localObject3 = localObject1;
      localOptions.<init>();
      localObject3 = localObject1;
      paramInt5 = a(paramRect.width(), paramRect.height(), paramInt5, paramInt6) * paramInt4;
      localObject3 = localObject1;
      localOptions.inSampleSize = paramInt5;
      localObject3 = localObject1;
      paramRect = a(paramContext.getContentResolver(), paramUri, localOptions);
      paramContext = (Context)localObject2;
      if (paramRect != null) {
        try
        {
          paramContext = new float[paramArrayOfFloat.length];
          paramInt6 = paramArrayOfFloat.length;
          paramInt4 = 0;
          System.arraycopy(paramArrayOfFloat, 0, paramContext, 0, paramInt6);
          while (paramInt4 < paramContext.length)
          {
            paramContext[paramInt4] /= localOptions.inSampleSize;
            paramInt4++;
          }
          paramArrayOfFloat = a(paramRect, paramContext, paramInt1, paramBoolean1, paramInt2, paramInt3, 1.0F, paramBoolean2, paramBoolean3);
          paramContext = paramArrayOfFloat;
          if (paramArrayOfFloat != paramRect)
          {
            localObject3 = paramArrayOfFloat;
            paramRect.recycle();
            paramContext = paramArrayOfFloat;
          }
        }
        finally
        {
          if (paramRect != null)
          {
            localObject3 = localObject1;
            paramRect.recycle();
          }
          localObject3 = localObject1;
        }
      }
      return new a(paramContext, paramInt5);
    }
    catch (Exception paramArrayOfFloat)
    {
      paramContext = new StringBuilder();
      paramContext.append("Failed to load sampled bitmap: ");
      paramContext.append(paramUri);
      paramContext.append("\r\n");
      paramContext.append(paramArrayOfFloat.getMessage());
      throw new RuntimeException(paramContext.toString(), paramArrayOfFloat);
    }
    catch (OutOfMemoryError paramContext)
    {
      if (localObject3 != null) {
        ((Bitmap)localObject3).recycle();
      }
      throw paramContext;
    }
  }
  
  static a a(Bitmap paramBitmap, float[] paramArrayOfFloat, int paramInt1, boolean paramBoolean1, int paramInt2, int paramInt3, boolean paramBoolean2, boolean paramBoolean3)
  {
    int i = 1;
    do
    {
      float f1 = 1.0F / i;
      try
      {
        a locala = new a(a(paramBitmap, paramArrayOfFloat, paramInt1, paramBoolean1, paramInt2, paramInt3, f1, paramBoolean2, paramBoolean3), i);
        return locala;
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        i *= 2;
      }
    } while (i <= 8);
    throw localOutOfMemoryError;
  }
  
  static b a(Bitmap paramBitmap, Va paramVa)
  {
    int i = paramVa.a("Orientation", 1);
    if (i != 3)
    {
      if (i != 6)
      {
        if (i != 8) {
          i = 0;
        } else {
          i = 270;
        }
      }
      else {
        i = 90;
      }
    }
    else {
      i = 180;
    }
    return new b(paramBitmap, i);
  }
  
  static b a(Bitmap paramBitmap, Context paramContext, Uri paramUri)
  {
    for (;;)
    {
      try
      {
        paramUri = paramContext.getContentResolver().openInputStream(paramUri);
        if (paramUri != null)
        {
          paramContext = new Va;
          paramContext.<init>(paramUri);
        }
      }
      catch (Exception paramContext)
      {
        continue;
      }
      try
      {
        paramUri.close();
      }
      catch (Exception paramUri) {}
    }
    paramContext = null;
    if (paramContext != null) {
      paramBitmap = a(paramBitmap, paramContext);
    } else {
      paramBitmap = new b(paramBitmap, 0);
    }
    return paramBitmap;
  }
  
  static void a(Context paramContext, Bitmap paramBitmap, Uri paramUri, Bitmap.CompressFormat paramCompressFormat, int paramInt)
    throws FileNotFoundException
  {
    Context localContext = null;
    try
    {
      paramContext = paramContext.getContentResolver().openOutputStream(paramUri);
      localContext = paramContext;
      paramBitmap.compress(paramCompressFormat, paramInt, paramContext);
      return;
    }
    finally
    {
      a(localContext);
    }
  }
  
  private static void a(Rect paramRect, int paramInt1, int paramInt2)
  {
    if ((paramInt1 == paramInt2) && (paramRect.width() != paramRect.height())) {
      if (paramRect.height() > paramRect.width()) {
        paramRect.bottom -= paramRect.height() - paramRect.width();
      } else {
        paramRect.right -= paramRect.width() - paramRect.height();
      }
    }
  }
  
  private static void a(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable)
    {
      for (;;) {}
    }
  }
  
  static float b(float[] paramArrayOfFloat)
  {
    return (f(paramArrayOfFloat) + e(paramArrayOfFloat)) / 2.0F;
  }
  
  static float c(float[] paramArrayOfFloat)
  {
    return (a(paramArrayOfFloat) + g(paramArrayOfFloat)) / 2.0F;
  }
  
  static float d(float[] paramArrayOfFloat)
  {
    return a(paramArrayOfFloat) - g(paramArrayOfFloat);
  }
  
  static float e(float[] paramArrayOfFloat)
  {
    return Math.min(Math.min(Math.min(paramArrayOfFloat[0], paramArrayOfFloat[2]), paramArrayOfFloat[4]), paramArrayOfFloat[6]);
  }
  
  static float f(float[] paramArrayOfFloat)
  {
    return Math.max(Math.max(Math.max(paramArrayOfFloat[0], paramArrayOfFloat[2]), paramArrayOfFloat[4]), paramArrayOfFloat[6]);
  }
  
  static float g(float[] paramArrayOfFloat)
  {
    return Math.min(Math.min(Math.min(paramArrayOfFloat[1], paramArrayOfFloat[3]), paramArrayOfFloat[5]), paramArrayOfFloat[7]);
  }
  
  static float h(float[] paramArrayOfFloat)
  {
    return f(paramArrayOfFloat) - e(paramArrayOfFloat);
  }
  
  static final class a
  {
    public final Bitmap a;
    final int b;
    
    a(Bitmap paramBitmap, int paramInt)
    {
      this.a = paramBitmap;
      this.b = paramInt;
    }
  }
  
  static final class b
  {
    public final Bitmap a;
    final int b;
    
    b(Bitmap paramBitmap, int paramInt)
    {
      this.a = paramBitmap;
      this.b = paramInt;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/theartofdev/edmodo/cropper/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */