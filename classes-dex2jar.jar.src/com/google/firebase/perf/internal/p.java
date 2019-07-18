package com.google.firebase.perf.internal;

import Aw;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class p
  extends u
{
  private Aw a;
  
  p(Aw paramAw)
  {
    this.a = paramAw;
  }
  
  private final boolean a(Aw paramAw, int paramInt)
  {
    if (paramAw == null)
    {
      Log.w("FirebasePerformance", "TraceMetric is null");
      return false;
    }
    if (paramInt > 1)
    {
      Log.w("FirebasePerformance", "Exceed MAX_SUBTRACE_DEEP:1");
      return false;
    }
    Object localObject = paramAw.k();
    if (localObject != null)
    {
      localObject = ((String)localObject).trim();
      if ((!((String)localObject).isEmpty()) && (((String)localObject).length() <= 100))
      {
        i = 1;
        break label68;
      }
    }
    int i = 0;
    label68:
    if (i == 0)
    {
      paramAw = String.valueOf(paramAw.k());
      if (paramAw.length() != 0) {
        paramAw = "invalid TraceId:".concat(paramAw);
      } else {
        paramAw = new String("invalid TraceId:");
      }
      Log.w("FirebasePerformance", paramAw);
      return false;
    }
    if ((paramAw != null) && (paramAw.j() > 0L)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0)
    {
      long l = paramAw.j();
      paramAw = new StringBuilder(42);
      paramAw.append("invalid TraceDuration:");
      paramAw.append(l);
      Log.w("FirebasePerformance", paramAw.toString());
      return false;
    }
    if (!paramAw.l())
    {
      Log.w("FirebasePerformance", "clientStartTimeUs is null.");
      return false;
    }
    localObject = paramAw.p().iterator();
    while (((Iterator)localObject).hasNext()) {
      if (!a((Aw)((Iterator)localObject).next(), paramInt + 1)) {
        return false;
      }
    }
    localObject = paramAw.q().entrySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      paramAw = u.a((Map.Entry)((Iterator)localObject).next());
      if (paramAw != null)
      {
        Log.w("FirebasePerformance", paramAw);
        paramInt = 0;
        break label298;
      }
    }
    paramInt = 1;
    label298:
    return paramInt != 0;
  }
  
  private final boolean b(Aw paramAw, int paramInt)
  {
    if (paramAw == null) {
      return false;
    }
    if (paramInt > 1)
    {
      Log.w("FirebasePerformance", "Exceed MAX_SUBTRACE_DEEP:1");
      return false;
    }
    Iterator localIterator = paramAw.o().entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      String str = (String)((Map.Entry)localObject).getKey();
      if (str == null) {}
      for (;;)
      {
        i = 0;
        break label129;
        str = str.trim();
        if (str.isEmpty())
        {
          Log.w("FirebasePerformance", "counterId is empty");
        }
        else
        {
          if (str.length() <= 100) {
            break;
          }
          Log.w("FirebasePerformance", "counterId exceeded max length 100");
        }
      }
      int i = 1;
      label129:
      if (i == 0)
      {
        paramAw = String.valueOf((String)((Map.Entry)localObject).getKey());
        if (paramAw.length() != 0) {
          paramAw = "invalid CounterId:".concat(paramAw);
        } else {
          paramAw = new String("invalid CounterId:");
        }
        Log.w("FirebasePerformance", paramAw);
        return false;
      }
      if ((Long)((Map.Entry)localObject).getValue() != null) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0)
      {
        localObject = String.valueOf(((Map.Entry)localObject).getValue());
        paramAw = new StringBuilder(String.valueOf(localObject).length() + 21);
        paramAw.append("invalid CounterValue:");
        paramAw.append((String)localObject);
        Log.w("FirebasePerformance", paramAw.toString());
        return false;
      }
    }
    paramAw = paramAw.p().iterator();
    while (paramAw.hasNext()) {
      if (!b((Aw)paramAw.next(), paramInt + 1)) {
        return false;
      }
    }
    return true;
  }
  
  public final boolean a()
  {
    if (!a(this.a, 0))
    {
      localObject = String.valueOf(this.a.k());
      if (((String)localObject).length() != 0) {
        localObject = "Invalid Trace:".concat((String)localObject);
      } else {
        localObject = new String("Invalid Trace:");
      }
      Log.w("FirebasePerformance", (String)localObject);
      return false;
    }
    Object localObject = this.a;
    if (((Aw)localObject).n() > 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {}
    for (;;)
    {
      i = 1;
      break label137;
      localObject = ((Aw)localObject).p().iterator();
      do
      {
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
        if (((Aw)((Iterator)localObject).next()).n() > 0) {
          i = 1;
        } else {
          i = 0;
        }
      } while (i == 0);
    }
    int i = 0;
    label137:
    if ((i != 0) && (!b(this.a, 0)))
    {
      localObject = String.valueOf(this.a.k());
      if (((String)localObject).length() != 0) {
        localObject = "Invalid Counters for Trace:".concat((String)localObject);
      } else {
        localObject = new String("Invalid Counters for Trace:");
      }
      Log.w("FirebasePerformance", (String)localObject);
      return false;
    }
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/internal/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */