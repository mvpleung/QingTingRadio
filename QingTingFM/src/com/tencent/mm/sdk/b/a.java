package com.tencent.mm.sdk.b;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Process;

public final class a
{
  public static d h;
  private static a i;
  private static a j;
  private static final String k = ((StringBuilder)localObject).toString();
  private static int level = 6;

  static
  {
    Object localObject = new b();
    i = (a)localObject;
    j = (a)localObject;
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("VERSION.RELEASE:[" + Build.VERSION.RELEASE);
    ((StringBuilder)localObject).append("] VERSION.CODENAME:[" + Build.VERSION.CODENAME);
    ((StringBuilder)localObject).append("] VERSION.INCREMENTAL:[" + Build.VERSION.INCREMENTAL);
    ((StringBuilder)localObject).append("] BOARD:[" + Build.BOARD);
    ((StringBuilder)localObject).append("] DEVICE:[" + Build.DEVICE);
    ((StringBuilder)localObject).append("] DISPLAY:[" + Build.DISPLAY);
    ((StringBuilder)localObject).append("] FINGERPRINT:[" + Build.FINGERPRINT);
    ((StringBuilder)localObject).append("] HOST:[" + Build.HOST);
    ((StringBuilder)localObject).append("] MANUFACTURER:[" + Build.MANUFACTURER);
    ((StringBuilder)localObject).append("] MODEL:[" + Build.MODEL);
    ((StringBuilder)localObject).append("] PRODUCT:[" + Build.PRODUCT);
    ((StringBuilder)localObject).append("] TAGS:[" + Build.TAGS);
    ((StringBuilder)localObject).append("] TYPE:[" + Build.TYPE);
    ((StringBuilder)localObject).append("] USER:[" + Build.USER + "]");
  }

  public static void a(String paramString1, String paramString2)
  {
    a(paramString1, paramString2, null);
  }

  public static void a(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if ((j != null) && (j.b() <= 4))
      if (paramArrayOfObject != null)
        break label70;
    while (true)
    {
      paramArrayOfObject = paramString2;
      if (paramString2 == null)
        paramArrayOfObject = "";
      paramString1 = b(paramString1);
      paramString2 = j;
      Process.myPid();
      Thread.currentThread().getId();
      Looper.getMainLooper().getThread().getId();
      paramString2.f(paramString1, paramArrayOfObject);
      return;
      label70: paramString2 = String.format(paramString2, paramArrayOfObject);
    }
  }

  private static String b(String paramString)
  {
    String str = paramString;
    if (h != null)
      str = h.b(paramString);
    return str;
  }

  public static void b(String paramString1, String paramString2)
  {
    if ((j != null) && (j.b() <= 2))
    {
      String str = paramString2;
      if (paramString2 == null)
        str = "";
      paramString1 = b(paramString1);
      paramString2 = j;
      Process.myPid();
      Thread.currentThread().getId();
      Looper.getMainLooper().getThread().getId();
      paramString2.d(paramString1, str);
    }
  }

  public static void c(String paramString1, String paramString2)
  {
    if ((j != null) && (j.b() <= 1))
    {
      String str = paramString2;
      if (paramString2 == null)
        str = "";
      paramString1 = b(paramString1);
      paramString2 = j;
      Process.myPid();
      Thread.currentThread().getId();
      Looper.getMainLooper().getThread().getId();
      paramString2.e(paramString1, str);
    }
  }

  public static abstract interface a
  {
    public abstract int b();

    public abstract void d(String paramString1, String paramString2);

    public abstract void e(String paramString1, String paramString2);

    public abstract void f(String paramString1, String paramString2);
  }
}

/* Location:           C:\Users\User\dex2jar-2.0\dex\qting\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.b.a
 * JD-Core Version:    0.6.2
 */