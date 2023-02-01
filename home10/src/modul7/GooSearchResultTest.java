package modul7;

class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}
class GooSearchResult {
    private String url;

    public String getUrl() {
        return url;
    }


    public GooSearchResult(String url) {
        this.url = url;
    }

    public String parseDomain() {
        int startIndex = url.indexOf("://") + 3;
        int endIndex = url.indexOf("/", startIndex);
        if (endIndex == -1) {
            endIndex = url.length();
        }
        return url.substring(startIndex, endIndex);
    }
}

