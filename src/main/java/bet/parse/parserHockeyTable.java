package bet.parse;

import bet.entity.Team;
import bet.repository.dao.TeamDAO;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;

public class parserHockeyTable {
    private static TeamDAO teamDAO;
    //TeamDAO teamDAO;

    private static Document getPage() throws IOException {
            String urlKHL = "https://nb-bet.com/Hockey/Tournaments?ID=1";
            Document khlTable = Jsoup.parse(new URL(urlKHL), 30000);
            return khlTable;
    }

    public static void main(String[] args) throws IOException {
       teamDAO = new TeamDAO();
        Document table = getPage();
        Element temp = table.selectFirst("table[class=table-summary]");
        Elements cells1 = temp.select("tr[class=tournaments-stats-cells1]");
        Elements cells2 = temp.select("tr[class=tournaments-stats-cells2]");
        Elements numbersCeils1 = cells1.select("td[class=td-summary-content-extended]");
        Elements numbersCeils2 = cells2.select("td[class=td-summary-content-extended]");
        //System.out.println(numbersCeils1);
        int index = 0;

        for(Element element : cells1) {
            Team team = new Team();

            team.setName(numbersCeils1.get(index++).text());
            team.setNumberOfMatches((Integer.parseInt(numbersCeils1.get(index++).text())));
            team.setWin(Integer.parseInt(numbersCeils1.get(index++).text()));
            team.setDraw(Integer.parseInt(numbersCeils1.get(index++).text()));
            team.setLoosing(Integer.parseInt(numbersCeils1.get(index++).text()));
            team.setNumberOfGoal(Integer.parseInt(numbersCeils1.get(index++).text()));
            team.setNumberOfMissing(Integer.parseInt(numbersCeils1.get(index++).text()));
            team.setRaznica(Integer.parseInt(numbersCeils1.get(index++).text()));
            team.setTotal(numbersCeils1.get(index++).text());
            team.setIndividTotal(numbersCeils1.get(index++).text());
            team.setIndividTotalSop(numbersCeils1.get(index++).text());
            team.setBroski(numbersCeils1.get(index++).text());
            team.setVbr(numbersCeils1.get(index++).text());
            team.setStrafh(numbersCeils1.get(index++).text());
            team.setProcentWin(numbersCeils1.get(index++).text());
         //teamDAO.create(team);
            System.out.println(team);
        }
        int test =0;
        for(Element element : cells2) {
            Team team = new Team();

            team.setName(numbersCeils2.get(test++).text());
            team.setNumberOfMatches((Integer.parseInt(numbersCeils2.get(test++).text())));
            team.setWin(Integer.parseInt(numbersCeils2.get(test++).text()));
            team.setDraw(Integer.parseInt(numbersCeils2.get(test++).text()));
            team.setLoosing(Integer.parseInt(numbersCeils2.get(test++).text()));
            team.setNumberOfGoal(Integer.parseInt(numbersCeils2.get(test++).text()));
            team.setNumberOfMissing(Integer.parseInt(numbersCeils2.get(test++).text()));
            team.setRaznica(Integer.parseInt(numbersCeils2.get(test++).text()));
            team.setTotal(numbersCeils2.get(test++).text());
            team.setIndividTotal(numbersCeils2.get(test++).text());
            team.setIndividTotalSop(numbersCeils2.get(test++).text());
            team.setBroski(numbersCeils2.get(test++).text());
            team.setVbr(numbersCeils2.get(test++).text());
            team.setStrafh(numbersCeils2.get(test++).text());
            team.setProcentWin(numbersCeils2.get(test++).text());
           teamDAO.create(team);
            System.out.println(team);
        }

    }

}
