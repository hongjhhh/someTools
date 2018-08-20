public class GpsTest{
    private static final  double EARTH_RADIUS = 6371000;//����뾶(��λm)
    
    /**
     * ת��Ϊ����(rad)
     * */
    private static double rad(double d)
    {
       return d * Math.PI / 180.0;
    }
    /**
     * ����googleMap�е��㷨�õ�����γ��֮��ľ���,���㾫����ȸ��ͼ�ľ��뾫�Ȳ�࣬��Χ��0.2������
     * @param lon1 ��һ��ľ���
     * @param lat1 ��һ���γ��
     * @param lon2 �ڶ���ľ���
     * @param lat3 �ڶ����γ��
     * @return ���صľ��룬��λm
     * */
    public static double GetDistance(double lon1,double lat1,double lon2, double lat2)
    {
       double radLat1 = rad(lat1);
       double radLat2 = rad(lat2);
       double a = radLat1 - radLat2;
       double b = rad(lon1) - rad(lon2);
       double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a/2),2)+Math.cos(radLat1)*Math.cos(radLat2)*Math.pow(Math.sin(b/2),2)));
       s = s * EARTH_RADIUS;
       s = Math.round(s * 10000) / 10000;
       return s;
    }
    

    public static void main(String []args){
          double lon1=113.958182;  
          double lat1=22.546768;
          double lon2=113.952566;
          double lat2=22.537893;
          double dist;
          String geocode;
          
          dist=Test.GetDistance(lon1, lat1, lon2, lat2);
          System.out.println("������ࣺ" + dist + " ��");
 
       }
}
