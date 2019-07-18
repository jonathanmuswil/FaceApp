package com.google.android.gms.measurement.internal;

import BG;
import BG.a;
import DG;
import EG;
import FG;
import FG.a;
import KG;
import LG;
import NG;
import OG;
import PG;
import SG;
import TG;
import UG;
import ZJ;
import android.text.TextUtils;
import com.google.android.gms.common.util.e;
import gK;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kI;
import kI.a;
import tG;
import yG;
import zG;

public final class cc
  extends Wb
{
  cc(Xb paramXb)
  {
    super(paramXb);
  }
  
  static BG a(SG paramSG, String paramString)
  {
    for (paramSG : paramSG.d) {
      if (paramSG.m().equals(paramString)) {
        return paramSG;
      }
    }
    return null;
  }
  
  static List<Long> a(BitSet paramBitSet)
  {
    int i = (paramBitSet.length() + 63) / 64;
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++)
    {
      long l1 = 0L;
      int k = 0;
      while (k < 64)
      {
        int m = (j << 6) + k;
        if (m >= paramBitSet.length()) {
          break;
        }
        long l2 = l1;
        if (paramBitSet.get(m)) {
          l2 = l1 | 1L << k;
        }
        k++;
        l1 = l2;
      }
      localArrayList.add(Long.valueOf(l1));
    }
    return localArrayList;
  }
  
  private static void a(StringBuilder paramStringBuilder, int paramInt)
  {
    for (int i = 0; i < paramInt; i++) {
      paramStringBuilder.append("  ");
    }
  }
  
  private final void a(StringBuilder paramStringBuilder, int paramInt, LG paramLG)
  {
    if (paramLG == null) {
      return;
    }
    a(paramStringBuilder, paramInt);
    paramStringBuilder.append("filter {\n");
    a(paramStringBuilder, paramInt, "complement", paramLG.f);
    a(paramStringBuilder, paramInt, "param_name", d().b(paramLG.g));
    int i = paramInt + 1;
    Object localObject = paramLG.d;
    if (localObject != null)
    {
      a(paramStringBuilder, i);
      paramStringBuilder.append("string_filter");
      paramStringBuilder.append(" {\n");
      tG localtG = ((PG)localObject).c;
      if (localtG != null) {
        a(paramStringBuilder, i, "match_type", localtG.name());
      }
      a(paramStringBuilder, i, "expression", ((PG)localObject).d);
      a(paramStringBuilder, i, "case_sensitive", ((PG)localObject).e);
      if (((PG)localObject).f.length > 0)
      {
        a(paramStringBuilder, i + 1);
        paramStringBuilder.append("expression_list {\n");
        for (localtG : ((PG)localObject).f)
        {
          a(paramStringBuilder, i + 2);
          paramStringBuilder.append(localtG);
          paramStringBuilder.append("\n");
        }
        paramStringBuilder.append("}\n");
      }
      a(paramStringBuilder, i);
      paramStringBuilder.append("}\n");
    }
    a(paramStringBuilder, i, "number_filter", paramLG.e);
    a(paramStringBuilder, paramInt);
    paramStringBuilder.append("}\n");
  }
  
  private final void a(StringBuilder paramStringBuilder, int paramInt, String paramString1, DG paramDG, String paramString2)
  {
    if (paramDG == null) {
      return;
    }
    a(paramStringBuilder, 3);
    paramStringBuilder.append(paramString1);
    paramStringBuilder.append(" {\n");
    Object localObject;
    if (paramDG.p() != 0)
    {
      a(paramStringBuilder, 4);
      paramStringBuilder.append("results: ");
      paramString1 = paramDG.o().iterator();
      for (paramInt = 0; paramString1.hasNext(); paramInt++)
      {
        localObject = (Long)paramString1.next();
        if (paramInt != 0) {
          paramStringBuilder.append(", ");
        }
        paramStringBuilder.append(localObject);
      }
      paramStringBuilder.append('\n');
    }
    if (paramDG.n() != 0)
    {
      a(paramStringBuilder, 4);
      paramStringBuilder.append("status: ");
      paramString1 = paramDG.m().iterator();
      for (paramInt = 0; paramString1.hasNext(); paramInt++)
      {
        localObject = (Long)paramString1.next();
        if (paramInt != 0) {
          paramStringBuilder.append(", ");
        }
        paramStringBuilder.append(localObject);
      }
      paramStringBuilder.append('\n');
    }
    if (g().o(paramString2))
    {
      if (paramDG.r() != 0)
      {
        a(paramStringBuilder, 4);
        paramStringBuilder.append("dynamic_filter_timestamps: {");
        paramString2 = paramDG.q().iterator();
        for (paramInt = 0; paramString2.hasNext(); paramInt++)
        {
          localObject = (zG)paramString2.next();
          if (paramInt != 0) {
            paramStringBuilder.append(", ");
          }
          if (((zG)localObject).n()) {
            paramString1 = Integer.valueOf(((zG)localObject).m());
          } else {
            paramString1 = null;
          }
          paramStringBuilder.append(paramString1);
          paramStringBuilder.append(":");
          if (((zG)localObject).o()) {
            paramString1 = Long.valueOf(((zG)localObject).p());
          } else {
            paramString1 = null;
          }
          paramStringBuilder.append(paramString1);
        }
        paramStringBuilder.append("}\n");
      }
      if (paramDG.t() != 0)
      {
        a(paramStringBuilder, 4);
        paramStringBuilder.append("sequence_filter_timestamps: {");
        paramDG = paramDG.s().iterator();
        for (paramInt = 0; paramDG.hasNext(); paramInt++)
        {
          paramString2 = (EG)paramDG.next();
          if (paramInt != 0) {
            paramStringBuilder.append(", ");
          }
          if (paramString2.n()) {
            paramString1 = Integer.valueOf(paramString2.m());
          } else {
            paramString1 = null;
          }
          paramStringBuilder.append(paramString1);
          paramStringBuilder.append(": [");
          paramString1 = paramString2.o().iterator();
          for (int i = 0; paramString1.hasNext(); i++)
          {
            long l = ((Long)paramString1.next()).longValue();
            if (i != 0) {
              paramStringBuilder.append(", ");
            }
            paramStringBuilder.append(l);
          }
          paramStringBuilder.append("]");
        }
        paramStringBuilder.append("}\n");
      }
    }
    a(paramStringBuilder, 3);
    paramStringBuilder.append("}\n");
  }
  
  private final void a(StringBuilder paramStringBuilder, int paramInt, String paramString, NG paramNG)
  {
    if (paramNG == null) {
      return;
    }
    a(paramStringBuilder, paramInt);
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" {\n");
    paramString = paramNG.c;
    if (paramString != null) {
      a(paramStringBuilder, paramInt, "comparison_type", paramString.name());
    }
    a(paramStringBuilder, paramInt, "match_as_float", paramNG.d);
    a(paramStringBuilder, paramInt, "comparison_value", paramNG.e);
    a(paramStringBuilder, paramInt, "min_comparison_value", paramNG.f);
    a(paramStringBuilder, paramInt, "max_comparison_value", paramNG.g);
    a(paramStringBuilder, paramInt);
    paramStringBuilder.append("}\n");
  }
  
  private static void a(StringBuilder paramStringBuilder, int paramInt, String paramString, Object paramObject)
  {
    if (paramObject == null) {
      return;
    }
    a(paramStringBuilder, paramInt + 1);
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(": ");
    paramStringBuilder.append(paramObject);
    paramStringBuilder.append('\n');
  }
  
  static boolean a(String paramString)
  {
    return (paramString != null) && (paramString.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)")) && (paramString.length() <= 310);
  }
  
  static boolean a(List<Long> paramList, int paramInt)
  {
    return (paramInt < paramList.size() << 6) && ((1L << paramInt % 64 & ((Long)paramList.get(paramInt / 64)).longValue()) != 0L);
  }
  
  static BG[] a(BG[] paramArrayOfBG, String paramString, Object paramObject)
  {
    for (int i = 0; i < paramArrayOfBG.length; i++)
    {
      locala = (BG.a)paramArrayOfBG[i].j();
      if (paramString.equals(locala.i()))
      {
        locala.k();
        locala.j();
        locala.l();
        if ((paramObject instanceof Long)) {
          locala.a(((Long)paramObject).longValue());
        } else if ((paramObject instanceof String)) {
          locala.b((String)paramObject);
        } else if ((paramObject instanceof Double)) {
          locala.a(((Double)paramObject).doubleValue());
        }
        paramArrayOfBG[i] = ((BG)locala.J());
        return paramArrayOfBG;
      }
    }
    BG[] arrayOfBG = new BG[paramArrayOfBG.length + 1];
    System.arraycopy(paramArrayOfBG, 0, arrayOfBG, 0, paramArrayOfBG.length);
    BG.a locala = BG.u();
    locala.a(paramString);
    if ((paramObject instanceof Long)) {
      locala.a(((Long)paramObject).longValue());
    } else if ((paramObject instanceof String)) {
      locala.b((String)paramObject);
    } else if ((paramObject instanceof Double)) {
      locala.a(((Double)paramObject).doubleValue());
    }
    arrayOfBG[paramArrayOfBG.length] = ((BG)locala.J());
    return arrayOfBG;
  }
  
  static Object b(SG paramSG, String paramString)
  {
    paramSG = a(paramSG, paramString);
    if (paramSG != null)
    {
      if (paramSG.o()) {
        return paramSG.p();
      }
      if (paramSG.q()) {
        return Long.valueOf(paramSG.r());
      }
      if (paramSG.s()) {
        return Double.valueOf(paramSG.t());
      }
    }
    return null;
  }
  
  final long a(byte[] paramArrayOfByte)
  {
    com.google.android.gms.common.internal.t.a(paramArrayOfByte);
    e().j();
    MessageDigest localMessageDigest = hc.s();
    if (localMessageDigest == null)
    {
      c().s().a("Failed to get MD5");
      return 0L;
    }
    return hc.a(localMessageDigest.digest(paramArrayOfByte));
  }
  
  /* Error */
  final <T extends android.os.Parcelable> T a(byte[] paramArrayOfByte, android.os.Parcelable.Creator<T> paramCreator)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: invokestatic 399	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   9: astore_3
    //   10: aload_3
    //   11: aload_1
    //   12: iconst_0
    //   13: aload_1
    //   14: arraylength
    //   15: invokevirtual 403	android/os/Parcel:unmarshall	([BII)V
    //   18: aload_3
    //   19: iconst_0
    //   20: invokevirtual 406	android/os/Parcel:setDataPosition	(I)V
    //   23: aload_2
    //   24: aload_3
    //   25: invokeinterface 412 2 0
    //   30: checkcast 414	android/os/Parcelable
    //   33: astore_1
    //   34: aload_3
    //   35: invokevirtual 417	android/os/Parcel:recycle	()V
    //   38: aload_1
    //   39: areturn
    //   40: astore_1
    //   41: goto +23 -> 64
    //   44: astore_1
    //   45: aload_0
    //   46: invokevirtual 370	com/google/android/gms/measurement/internal/cc:c	()Lcom/google/android/gms/measurement/internal/v;
    //   49: invokevirtual 375	com/google/android/gms/measurement/internal/v:s	()Lcom/google/android/gms/measurement/internal/x;
    //   52: ldc_w 419
    //   55: invokevirtual 382	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;)V
    //   58: aload_3
    //   59: invokevirtual 417	android/os/Parcel:recycle	()V
    //   62: aconst_null
    //   63: areturn
    //   64: aload_3
    //   65: invokevirtual 417	android/os/Parcel:recycle	()V
    //   68: aload_1
    //   69: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	70	0	this	cc
    //   0	70	1	paramArrayOfByte	byte[]
    //   0	70	2	paramCreator	android.os.Parcelable.Creator<T>
    //   9	56	3	localParcel	android.os.Parcel
    // Exception table:
    //   from	to	target	type
    //   10	34	40	finally
    //   45	58	40	finally
    //   10	34	44	gq$a
  }
  
  final String a(KG paramKG)
  {
    if (paramKG == null) {
      return "null";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("\nevent_filter {\n");
    Integer localInteger = paramKG.d;
    int i = 0;
    a(localStringBuilder, 0, "filter_id", localInteger);
    a(localStringBuilder, 0, "event_name", d().a(paramKG.e));
    a(localStringBuilder, 1, "event_count_filter", paramKG.h);
    localStringBuilder.append("  filters {\n");
    paramKG = paramKG.f;
    int j = paramKG.length;
    while (i < j)
    {
      a(localStringBuilder, 2, paramKG[i]);
      i++;
    }
    a(localStringBuilder, 1);
    localStringBuilder.append("}\n}\n");
    return localStringBuilder.toString();
  }
  
  final String a(OG paramOG)
  {
    if (paramOG == null) {
      return "null";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("\nproperty_filter {\n");
    a(localStringBuilder, 0, "filter_id", paramOG.d);
    a(localStringBuilder, 0, "property_name", d().c(paramOG.e));
    a(localStringBuilder, 1, paramOG.f);
    localStringBuilder.append("}\n");
    return localStringBuilder.toString();
  }
  
  final void a(BG.a parama, Object paramObject)
  {
    com.google.android.gms.common.internal.t.a(paramObject);
    parama.j();
    parama.k();
    parama.l();
    if ((paramObject instanceof String))
    {
      parama.b((String)paramObject);
      return;
    }
    if ((paramObject instanceof Long))
    {
      parama.a(((Long)paramObject).longValue());
      return;
    }
    if ((paramObject instanceof Double))
    {
      parama.a(((Double)paramObject).doubleValue());
      return;
    }
    c().s().a("Ignoring invalid (type) event param value", paramObject);
  }
  
  final void a(FG.a parama, Object paramObject)
  {
    com.google.android.gms.common.internal.t.a(paramObject);
    parama.i();
    parama.j();
    parama.k();
    if ((paramObject instanceof String))
    {
      parama.b((String)paramObject);
      return;
    }
    if ((paramObject instanceof Long))
    {
      parama.b(((Long)paramObject).longValue());
      return;
    }
    if ((paramObject instanceof Double))
    {
      parama.a(((Double)paramObject).doubleValue());
      return;
    }
    c().s().a("Ignoring invalid (type) user attribute value", paramObject);
  }
  
  final boolean a(long paramLong1, long paramLong2)
  {
    return (paramLong1 == 0L) || (paramLong2 <= 0L) || (Math.abs(b().a() - paramLong1) > paramLong2);
  }
  
  final boolean a(k paramk, pc parampc)
  {
    com.google.android.gms.common.internal.t.a(paramk);
    com.google.android.gms.common.internal.t.a(parampc);
    if ((TextUtils.isEmpty(parampc.b)) && (TextUtils.isEmpty(parampc.r)))
    {
      a();
      return false;
    }
    return true;
  }
  
  final byte[] a(TG paramTG)
  {
    try
    {
      byte[] arrayOfByte = new byte[paramTG.b()];
      ZJ localZJ = ZJ.a(arrayOfByte, 0, arrayOfByte.length);
      paramTG.a(localZJ);
      localZJ.a();
      return arrayOfByte;
    }
    catch (IOException paramTG)
    {
      c().s().a("Data loss. Failed to serialize batch", paramTG);
    }
    return null;
  }
  
  final String b(TG paramTG)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("\nbatch {\n");
    paramTG = paramTG.c;
    if (paramTG != null)
    {
      int i = paramTG.length;
      for (int j = 0; j < i; j++)
      {
        Object localObject1 = paramTG[j];
        if ((localObject1 != null) && (localObject1 != null))
        {
          a(localStringBuilder, 1);
          localStringBuilder.append("bundle {\n");
          a(localStringBuilder, 1, "protocol_version", ((UG)localObject1).d);
          a(localStringBuilder, 1, "platform", ((UG)localObject1).l);
          a(localStringBuilder, 1, "gmp_version", ((UG)localObject1).t);
          a(localStringBuilder, 1, "uploading_gmp_version", ((UG)localObject1).u);
          a(localStringBuilder, 1, "dynamite_version", ((UG)localObject1).R);
          a(localStringBuilder, 1, "config_version", ((UG)localObject1).J);
          a(localStringBuilder, 1, "gmp_app_id", ((UG)localObject1).B);
          a(localStringBuilder, 1, "admob_app_id", ((UG)localObject1).O);
          a(localStringBuilder, 1, "app_id", ((UG)localObject1).r);
          a(localStringBuilder, 1, "app_version", ((UG)localObject1).s);
          a(localStringBuilder, 1, "app_version_major", ((UG)localObject1).F);
          a(localStringBuilder, 1, "firebase_instance_id", ((UG)localObject1).E);
          a(localStringBuilder, 1, "dev_cert_hash", ((UG)localObject1).y);
          a(localStringBuilder, 1, "app_store", ((UG)localObject1).q);
          a(localStringBuilder, 1, "upload_timestamp_millis", ((UG)localObject1).g);
          a(localStringBuilder, 1, "start_timestamp_millis", ((UG)localObject1).h);
          a(localStringBuilder, 1, "end_timestamp_millis", ((UG)localObject1).i);
          a(localStringBuilder, 1, "previous_bundle_start_timestamp_millis", ((UG)localObject1).j);
          a(localStringBuilder, 1, "previous_bundle_end_timestamp_millis", ((UG)localObject1).k);
          a(localStringBuilder, 1, "app_instance_id", ((UG)localObject1).x);
          a(localStringBuilder, 1, "resettable_device_id", ((UG)localObject1).v);
          a(localStringBuilder, 1, "device_id", ((UG)localObject1).I);
          a(localStringBuilder, 1, "ds_id", ((UG)localObject1).L);
          a(localStringBuilder, 1, "limited_ad_tracking", ((UG)localObject1).w);
          a(localStringBuilder, 1, "os_version", ((UG)localObject1).m);
          a(localStringBuilder, 1, "device_model", ((UG)localObject1).n);
          a(localStringBuilder, 1, "user_default_language", ((UG)localObject1).o);
          a(localStringBuilder, 1, "time_zone_offset_minutes", ((UG)localObject1).p);
          a(localStringBuilder, 1, "bundle_sequential_index", ((UG)localObject1).z);
          a(localStringBuilder, 1, "service_upload", ((UG)localObject1).C);
          a(localStringBuilder, 1, "health_monitor", ((UG)localObject1).A);
          Object localObject2 = ((UG)localObject1).K;
          if ((localObject2 != null) && (((Long)localObject2).longValue() != 0L)) {
            a(localStringBuilder, 1, "android_id", ((UG)localObject1).K);
          }
          localObject2 = ((UG)localObject1).N;
          if (localObject2 != null) {
            a(localStringBuilder, 1, "retry_counter", localObject2);
          }
          Object localObject3 = ((UG)localObject1).f;
          Object localObject4 = "string_value";
          Object localObject5 = "name";
          int k;
          if (localObject3 != null)
          {
            k = localObject3.length;
            for (m = 0; m < k; m++)
            {
              localObject6 = localObject3[m];
              if (localObject6 != null)
              {
                a(localStringBuilder, 2);
                localStringBuilder.append("user_property {\n");
                if (((FG)localObject6).u()) {
                  localObject2 = Long.valueOf(((FG)localObject6).v());
                } else {
                  localObject2 = null;
                }
                a(localStringBuilder, 2, "set_timestamp_millis", localObject2);
                a(localStringBuilder, 2, "name", d().c(((FG)localObject6).m()));
                a(localStringBuilder, 2, "string_value", ((FG)localObject6).p());
                if (((FG)localObject6).q()) {
                  localObject2 = Long.valueOf(((FG)localObject6).r());
                } else {
                  localObject2 = null;
                }
                a(localStringBuilder, 2, "int_value", localObject2);
                if (((FG)localObject6).s()) {
                  localObject2 = Double.valueOf(((FG)localObject6).t());
                } else {
                  localObject2 = null;
                }
                a(localStringBuilder, 2, "double_value", localObject2);
                a(localStringBuilder, 2);
                localStringBuilder.append("}\n");
              }
            }
          }
          yG[] arrayOfyG = ((UG)localObject1).D;
          String str = ((UG)localObject1).r;
          localObject3 = localObject5;
          Object localObject6 = localObject4;
          localObject2 = paramTG;
          if (arrayOfyG != null)
          {
            m = arrayOfyG.length;
            for (k = 0;; k++)
            {
              localObject3 = localObject5;
              localObject6 = localObject4;
              localObject2 = paramTG;
              if (k >= m) {
                break;
              }
              localObject2 = arrayOfyG[k];
              if (localObject2 != null)
              {
                a(localStringBuilder, 2);
                localStringBuilder.append("audience_membership {\n");
                if (((yG)localObject2).n()) {
                  a(localStringBuilder, 2, "audience_id", Integer.valueOf(((yG)localObject2).o()));
                }
                if (((yG)localObject2).s()) {
                  a(localStringBuilder, 2, "new_audience", Boolean.valueOf(((yG)localObject2).t()));
                }
                a(localStringBuilder, 2, "current_data", ((yG)localObject2).p(), str);
                a(localStringBuilder, 2, "previous_data", ((yG)localObject2).r(), str);
                a(localStringBuilder, 2);
                localStringBuilder.append("}\n");
              }
            }
          }
          paramTG = (TG)localObject3;
          localObject3 = localObject2;
          int m = 2;
          localObject4 = ((UG)localObject1).e;
          if (localObject4 != null)
          {
            int n = localObject4.length;
            int i1 = 0;
            localObject2 = paramTG;
            paramTG = (TG)localObject4;
            while (i1 < n)
            {
              localObject4 = paramTG[i1];
              if (localObject4 != null)
              {
                a(localStringBuilder, m);
                localStringBuilder.append("event {\n");
                localObject1 = d().a(((SG)localObject4).e);
                localObject5 = localObject2;
                a(localStringBuilder, m, (String)localObject5, localObject1);
                a(localStringBuilder, m, "timestamp_millis", ((SG)localObject4).f);
                a(localStringBuilder, m, "previous_timestamp_millis", ((SG)localObject4).g);
                a(localStringBuilder, m, "count", ((SG)localObject4).h);
                localObject1 = ((SG)localObject4).d;
                k = m;
                localObject4 = paramTG;
                if (localObject1 != null)
                {
                  int i2 = localObject1.length;
                  int i3 = 0;
                  for (;;)
                  {
                    k = m;
                    localObject4 = paramTG;
                    if (i3 >= i2) {
                      break;
                    }
                    arrayOfyG = localObject1[i3];
                    if (arrayOfyG != null)
                    {
                      a(localStringBuilder, 3);
                      localStringBuilder.append("param {\n");
                      a(localStringBuilder, 3, (String)localObject5, d().b(arrayOfyG.m()));
                      a(localStringBuilder, 3, (String)localObject6, arrayOfyG.p());
                      if (arrayOfyG.q()) {
                        localObject4 = Long.valueOf(arrayOfyG.r());
                      } else {
                        localObject4 = null;
                      }
                      a(localStringBuilder, 3, "int_value", localObject4);
                      if (arrayOfyG.s()) {
                        localObject4 = Double.valueOf(arrayOfyG.t());
                      } else {
                        localObject4 = null;
                      }
                      a(localStringBuilder, 3, "double_value", localObject4);
                      a(localStringBuilder, 3);
                      localStringBuilder.append("}\n");
                    }
                    i3++;
                    m = 2;
                  }
                }
                paramTG = (TG)localObject4;
                a(localStringBuilder, k);
                localStringBuilder.append("}\n");
                m = k;
              }
              i1++;
            }
          }
          a(localStringBuilder, 1);
          localStringBuilder.append("}\n");
          paramTG = (TG)localObject3;
        }
      }
    }
    localStringBuilder.append("}\n");
    return localStringBuilder.toString();
  }
  
  final byte[] b(byte[] paramArrayOfByte)
    throws IOException
  {
    try
    {
      ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
      localByteArrayInputStream.<init>(paramArrayOfByte);
      GZIPInputStream localGZIPInputStream = new java/util/zip/GZIPInputStream;
      localGZIPInputStream.<init>(localByteArrayInputStream);
      paramArrayOfByte = new java/io/ByteArrayOutputStream;
      paramArrayOfByte.<init>();
      byte[] arrayOfByte = new byte['Ѐ'];
      for (;;)
      {
        int i = localGZIPInputStream.read(arrayOfByte);
        if (i <= 0) {
          break;
        }
        paramArrayOfByte.write(arrayOfByte, 0, i);
      }
      localGZIPInputStream.close();
      localByteArrayInputStream.close();
      paramArrayOfByte = paramArrayOfByte.toByteArray();
      return paramArrayOfByte;
    }
    catch (IOException paramArrayOfByte)
    {
      c().s().a("Failed to ungzip content", paramArrayOfByte);
      throw paramArrayOfByte;
    }
  }
  
  final byte[] c(byte[] paramArrayOfByte)
    throws IOException
  {
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
      GZIPOutputStream localGZIPOutputStream = new java/util/zip/GZIPOutputStream;
      localGZIPOutputStream.<init>(localByteArrayOutputStream);
      localGZIPOutputStream.write(paramArrayOfByte);
      localGZIPOutputStream.close();
      localByteArrayOutputStream.close();
      paramArrayOfByte = localByteArrayOutputStream.toByteArray();
      return paramArrayOfByte;
    }
    catch (IOException paramArrayOfByte)
    {
      c().s().a("Failed to gzip content", paramArrayOfByte);
      throw paramArrayOfByte;
    }
  }
  
  protected final boolean t()
  {
    return false;
  }
  
  final int[] u()
  {
    Object localObject = m.a(this.b.getContext());
    if ((localObject != null) && (((Map)localObject).size() != 0))
    {
      ArrayList localArrayList = new ArrayList();
      int i = ((Integer)m.aa.a(null)).intValue();
      localObject = ((Map)localObject).entrySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
        if (((String)localEntry.getKey()).startsWith("measurement.id.")) {
          try
          {
            j = Integer.parseInt((String)localEntry.getValue());
            if (j != 0)
            {
              localArrayList.add(Integer.valueOf(j));
              if (localArrayList.size() >= i) {
                c().v().a("Too many experiment IDs. Number of IDs", Integer.valueOf(localArrayList.size()));
              }
            }
          }
          catch (NumberFormatException localNumberFormatException)
          {
            c().v().a("Experiment ID NumberFormatException", localNumberFormatException);
          }
        }
      }
      if (localArrayList.size() == 0) {
        return null;
      }
      int[] arrayOfInt = new int[localArrayList.size()];
      int k = localArrayList.size();
      i = 0;
      for (int j = 0; i < k; j++)
      {
        localObject = localArrayList.get(i);
        i++;
        arrayOfInt[j] = ((Integer)localObject).intValue();
      }
      return arrayOfInt;
    }
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/cc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */