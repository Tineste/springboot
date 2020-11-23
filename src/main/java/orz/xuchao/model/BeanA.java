package orz.xuchao.model;

public class BeanA {


    /**
     * page : 1
     * size : 10
     * queryStartDate : 2020-01-01 00:00:00
     * queryEndDate : 2020-07-17 17:30:00
     */

    private int page;
    private int size;
    private String queryStartDate;
    private String queryEndDate;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getQueryStartDate() {
        return queryStartDate;
    }

    public void setQueryStartDate(String queryStartDate) {
        this.queryStartDate = queryStartDate;
    }

    public String getQueryEndDate() {
        return queryEndDate;
    }

    public void setQueryEndDate(String queryEndDate) {
        this.queryEndDate = queryEndDate;
    }
}
