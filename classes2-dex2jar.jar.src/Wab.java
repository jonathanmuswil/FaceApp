import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class wab
  extends AbstractList<mab>
  implements RandomAccess
{
  final mab[] a;
  final int[] b;
  
  private wab(mab[] paramArrayOfmab, int[] paramArrayOfInt)
  {
    this.a = paramArrayOfmab;
    this.b = paramArrayOfInt;
  }
  
  private static int a(jab paramjab)
  {
    return (int)(paramjab.size() / 4L);
  }
  
  public static wab a(mab... paramVarArgs)
  {
    int i = paramVarArgs.length;
    int j = 0;
    if (i == 0) {
      return new wab(new mab[0], new int[] { 0, -1 });
    }
    ArrayList localArrayList = new ArrayList(Arrays.asList(paramVarArgs));
    Collections.sort(localArrayList);
    Object localObject1 = new ArrayList();
    for (i = 0; i < localArrayList.size(); i++) {
      ((List)localObject1).add(Integer.valueOf(-1));
    }
    for (i = 0; i < localArrayList.size(); i++) {
      ((List)localObject1).set(Collections.binarySearch(localArrayList, paramVarArgs[i]), Integer.valueOf(i));
    }
    if (((mab)localArrayList.get(0)).e() != 0)
    {
      int k;
      for (i = 0; i < localArrayList.size(); i = k)
      {
        mab localmab = (mab)localArrayList.get(i);
        k = i + 1;
        int m = k;
        while (m < localArrayList.size())
        {
          localObject2 = (mab)localArrayList.get(m);
          if (((mab)localObject2).b(localmab)) {
            if (((mab)localObject2).e() != localmab.e())
            {
              if (((Integer)((List)localObject1).get(m)).intValue() > ((Integer)((List)localObject1).get(i)).intValue())
              {
                localArrayList.remove(m);
                ((List)localObject1).remove(m);
              }
              else
              {
                m++;
              }
            }
            else
            {
              paramVarArgs = new StringBuilder();
              paramVarArgs.append("duplicate option: ");
              paramVarArgs.append(localObject2);
              throw new IllegalArgumentException(paramVarArgs.toString());
            }
          }
        }
      }
      Object localObject2 = new jab();
      a(0L, (jab)localObject2, 0, localArrayList, 0, localArrayList.size(), (List)localObject1);
      localObject1 = new int[a((jab)localObject2)];
      for (i = j; i < localObject1.length; i++) {
        localObject1[i] = ((jab)localObject2).readInt();
      }
      if (((jab)localObject2).p()) {
        return new wab((mab[])paramVarArgs.clone(), (int[])localObject1);
      }
      throw new AssertionError();
    }
    throw new IllegalArgumentException("the empty byte string is not a supported option");
  }
  
  private static void a(long paramLong, jab paramjab, int paramInt1, List<mab> paramList, int paramInt2, int paramInt3, List<Integer> paramList1)
  {
    int i = paramInt2;
    if (i < paramInt3)
    {
      int j = i;
      while (j < paramInt3) {
        if (((mab)paramList.get(j)).e() >= paramInt1) {
          j++;
        } else {
          throw new AssertionError();
        }
      }
      mab localmab1 = (mab)paramList.get(paramInt2);
      mab localmab2 = (mab)paramList.get(paramInt3 - 1);
      j = -1;
      paramInt2 = i;
      Object localObject = localmab1;
      if (paramInt1 == localmab1.e())
      {
        j = ((Integer)paramList1.get(i)).intValue();
        paramInt2 = i + 1;
        localObject = (mab)paramList.get(paramInt2);
      }
      int k;
      int m;
      if (((mab)localObject).a(paramInt1) != localmab2.a(paramInt1))
      {
        k = paramInt2 + 1;
        for (i = 1; k < paramInt3; i = m)
        {
          m = i;
          if (((mab)paramList.get(k - 1)).a(paramInt1) != ((mab)paramList.get(k)).a(paramInt1)) {
            m = i + 1;
          }
          k++;
        }
        paramLong = paramLong + a(paramjab) + 2L + i * 2;
        paramjab.writeInt(i);
        paramjab.writeInt(j);
        for (i = paramInt2; i < paramInt3; i++)
        {
          j = ((mab)paramList.get(i)).a(paramInt1);
          if ((i == paramInt2) || (j != ((mab)paramList.get(i - 1)).a(paramInt1))) {
            paramjab.writeInt(j & 0xFF);
          }
        }
        localObject = new jab();
        for (i = paramInt2; i < paramInt3; i = paramInt2)
        {
          m = ((mab)paramList.get(i)).a(paramInt1);
          j = i + 1;
          for (paramInt2 = j; paramInt2 < paramInt3; paramInt2++) {
            if (m != ((mab)paramList.get(paramInt2)).a(paramInt1)) {
              break label427;
            }
          }
          paramInt2 = paramInt3;
          label427:
          if ((j == paramInt2) && (paramInt1 + 1 == ((mab)paramList.get(i)).e()))
          {
            paramjab.writeInt(((Integer)paramList1.get(i)).intValue());
          }
          else
          {
            paramjab.writeInt((int)((a((jab)localObject) + paramLong) * -1L));
            a(paramLong, (jab)localObject, paramInt1 + 1, paramList, i, paramInt2, paramList1);
          }
        }
        paramjab.a((jab)localObject, ((jab)localObject).size());
      }
      else
      {
        k = Math.min(((mab)localObject).e(), localmab2.e());
        m = paramInt1;
        i = 0;
        while ((m < k) && (((mab)localObject).a(m) == localmab2.a(m)))
        {
          i++;
          m++;
        }
        paramLong = 1L + (paramLong + a(paramjab) + 2L + i);
        paramjab.writeInt(-i);
        paramjab.writeInt(j);
        for (j = paramInt1;; j++)
        {
          m = paramInt1 + i;
          if (j >= m) {
            break;
          }
          paramjab.writeInt(((mab)localObject).a(j) & 0xFF);
        }
        if (paramInt2 + 1 == paramInt3)
        {
          if (m == ((mab)paramList.get(paramInt2)).e()) {
            paramjab.writeInt(((Integer)paramList1.get(paramInt2)).intValue());
          } else {
            throw new AssertionError();
          }
        }
        else
        {
          localObject = new jab();
          paramjab.writeInt((int)((a((jab)localObject) + paramLong) * -1L));
          a(paramLong, (jab)localObject, m, paramList, paramInt2, paramInt3, paramList1);
          paramjab.a((jab)localObject, ((jab)localObject).size());
        }
      }
      return;
    }
    throw new AssertionError();
  }
  
  public mab get(int paramInt)
  {
    return this.a[paramInt];
  }
  
  public final int size()
  {
    return this.a.length;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/wab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */