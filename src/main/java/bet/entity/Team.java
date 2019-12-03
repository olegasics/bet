package bet.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Team implements Serializable {

    private static final long serialVersionUID = 859827029516132768L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer draw;

    @Column
    private Integer numberOfMatches;

    @Column
    private Integer notDraw;

    @Column
    private Integer loosing;

    @Column
    private int numberOfGoal;

    @Column
    private int numberOfMissing;

    @Column
    private Integer win;

    @Column
    private Integer raznica;

    @Column
    private String total;

    @Column
    private String individTotal;

    @Column
    private String individTotalSop;

    @Column
    private String broski;

    @Column
    private String vbr;

    @Column
    private String strafh;

    @Column
    private String procentWin;

    public Team() {
    }

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, Integer draw, Integer numberOfMatches, Integer notDraw) {
        this.name = name;
        this.draw = draw;
        this.numberOfMatches = numberOfMatches;
        this.notDraw = notDraw;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDraw() {
        return draw;
    }

    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    public Integer getNumberOfMatches() {
        return numberOfMatches;
    }

    public void setNumberOfMatches(Integer numberOfMatches) {
        this.numberOfMatches = numberOfMatches;
    }

    public Integer getNotDraw() {
        return notDraw;
    }

    public void setNotDraw(Integer notDraw) {
        this.notDraw = notDraw;
    }

    public Integer getLoosing() {
        return loosing;
    }

    public void setLoosing(Integer loosing) {
        this.loosing = loosing;
    }

    public int getNumberOfGoal() {
        return numberOfGoal;
    }

    public void setNumberOfGoal(int numberOfGoal) {
        this.numberOfGoal = numberOfGoal;
    }

    public int getNumberOfMissing() {
        return numberOfMissing;
    }

    public void setNumberOfMissing(int numberOfMissing) {
        this.numberOfMissing = numberOfMissing;
    }

    public Integer getWin() {
        return win;
    }

    public void setWin(Integer win) {
        this.win = win;
    }

    public Integer getRaznica() {
        return raznica;
    }

    public void setRaznica(Integer raznica) {
        this.raznica = raznica;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getIndividTotal() {
        return individTotal;
    }

    public void setIndividTotal(String individTotal) {
        this.individTotal = individTotal;
    }

    public String getIndividTotalSop() {
        return individTotalSop;
    }

    public void setIndividTotalSop(String individTotalSop) {
        this.individTotalSop = individTotalSop;
    }

    public String getBroski() {
        return broski;
    }

    public void setBroski(String broski) {
        this.broski = broski;
    }

    public String getVbr() {
        return vbr;
    }

    public void setVbr(String vbr) {
        this.vbr = vbr;
    }

    public String getStrafh() {
        return strafh;
    }

    public void setStrafh(String strafh) {
        this.strafh = strafh;
    }

    public String getProcentWin() {
        return procentWin;
    }

    public void setProcentWin(String procentWin) {
        this.procentWin = procentWin;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", draw=" + draw +
                ", numberOfMatches=" + numberOfMatches +
                ", notDraw=" + notDraw +
                ", loosing=" + loosing +
                ", numberOfGoal=" + numberOfGoal +
                ", numberOfMissing=" + numberOfMissing +
                ", win=" + win +
                '}';
    }
}
