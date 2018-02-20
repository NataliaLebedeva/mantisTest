package mantis.enums;

import lombok.Getter;

@Getter
public enum MANTIS_PAGES {
    MY_VIEW("обзор"), VIEW_ISSUES("список задач"), REPORT_ISSUE, CHANGE_LOG, ROADMAP, SUMMARY, MANAGE;

    private String page;

    MANTIS_PAGES() {
    }

    MANTIS_PAGES(String page) {
        this.page = page;
    }
}
