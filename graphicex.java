package graphic;
interface graphics
{
  public float carea(int r);
  public float rarea(int l,int b);
  public float sarea(int s);
  public float tarea(int b,int h);
}
public class graphicex implements graphics
{
  public float carea(int r)
  {    
     return r*r*(float)3.14;
  }
  public float rarea(int l,int b)
  {
    return l*b;
  }
  public float sarea(int s)
  {
    return s*s;
  }
  public float tarea(int b,int h)
  {
    return b*h*(float)0.5;
  }
}
