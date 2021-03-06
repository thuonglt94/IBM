package util;

import domain.detail.account.LoginDetails;
import domain.detail.task.DashboardDetail;
import domain.detail.task.TaskDetail;
import page.LoginPage;
import page.ProjectDashBoardPage;
import page.TaskDetailPage;
import page.CurrentSprintPage;
import page.HomePage;

public class Specification {

	PageStore pageStore;

	public Specification(PageStore pageStore) {
		this.pageStore = pageStore;
	}

	public void clickLoginWith(LoginDetails loginDetails) {
		LoginPage onLoginPage = pageStore.get(LoginPage.class);
		onLoginPage.loginToMainPage(loginDetails);
	}

	public void goToProjectDashboard() {
		HomePage onHomePage = pageStore.get(HomePage.class);
		onHomePage.goToProjectDashboard();
	}

	public void browsePlans() {
		ProjectDashBoardPage onProjectDashBoardPagee = pageStore.get(ProjectDashBoardPage.class);
		onProjectDashBoardPagee.clickPlansMenu();
	}

	public void clickAllPlans() {
		ProjectDashBoardPage onProjectDashBoardPagee = pageStore.get(ProjectDashBoardPage.class);
		onProjectDashBoardPagee.clickAllPlans();
	}

	public void selectTeamArea() {
		ProjectDashBoardPage onProjectDashBoardPagee = pageStore.get(ProjectDashBoardPage.class);
		onProjectDashBoardPagee.chooseTeamArea();
	}

	/*public void chooseTeam() {
		ProjectDashBoardPage onProjectDashBoardPagee = pageStore.get(ProjectDashBoardPage.class);
		onProjectDashBoardPagee.chooseTeam();

	}*/

	/*public void chooseTeamKDD() {
		ProjectDashBoardPage onProjectDashBoardPagee = pageStore.get(ProjectDashBoardPage.class);
		onProjectDashBoardPagee.selectTeamPharmacy();
	}*/

	public void clickCurrentSprint() {
		ProjectDashBoardPage onProjectDashBoardPagee = pageStore.get(ProjectDashBoardPage.class);
		onProjectDashBoardPagee.clickCurrentSprint();
	}

	public void clickAddNewWorkItem() {
		CurrentSprintPage onCurrentSprintPage = pageStore.get(CurrentSprintPage.class);
		onCurrentSprintPage.clickDropDownAddWorkItem();
	}

	public void clickAddNewTask() {
		CurrentSprintPage onCurrentSprintPage = pageStore.get(CurrentSprintPage.class);
		onCurrentSprintPage.clickTaskOnDropDown();
	}

	public void goToDetailTaskPage(TaskDetail taskDetail) {
		CurrentSprintPage onCurrentSprintPage = pageStore.get(CurrentSprintPage.class);
		onCurrentSprintPage.gotoTaskDetailPage(taskDetail);
	}

	public void clickOwnedBy() {
		TaskDetailPage onTaskDetailPage = pageStore.get(TaskDetailPage.class);
		onTaskDetailPage.chooseOwnedBy();
	}
	
	/*public void clickOwnedBy() {
		TaskDetailPage onTaskDetailPage = pageStore.get(TaskDetailPage.class);
		onTaskDetailPage.clickOwnedBy();
	}*/

	public void enterTimeEstimate(TaskDetail taskDetail) {
		TaskDetailPage onTaskDetailPage = pageStore.get(TaskDetailPage.class);
		onTaskDetailPage.enterTimeEstimateWith(taskDetail);
	}

	/*public void chooseDueDate() {
		TaskDetailPage onTaskDetailPage = pageStore.get(TaskDetailPage.class);
		onTaskDetailPage.chooseDueDate();
	}*/

	public void clickTabTimeTracking() {
		TaskDetailPage onTaskDetailPage = pageStore.get(TaskDetailPage.class);
		onTaskDetailPage.clickTabTimeTracking();
	}

	/*public void chooseTaskGroup() {
		TaskDetailPage onTaskDetailPage = pageStore.get(TaskDetailPage.class);
		onTaskDetailPage.chooseTaskGroup();
	}*/
	public void chooseTaskGroup(TaskDetail taskDetail) {
		TaskDetailPage onTaskDetailPage = pageStore.get(TaskDetailPage.class);
		onTaskDetailPage.chooseTaskGroup(taskDetail.getTaskGroup());
	}


	public void clickToAddTimeEntryRow() {
		TaskDetailPage onTaskDetailPage = pageStore.get(TaskDetailPage.class);
		onTaskDetailPage.clickToAddTimeEntryRow();
	}

	/*public void enterTimeTracking(TaskDetail taskDetail) {
		TaskDetailPage onTaskDetailPage = pageStore.get(TaskDetailPage.class);
		onTaskDetailPage.enterTimeTracking(taskDetail.getWorkDay(), taskDetail.getTimeTracking());
	}*/

	public void enterTimeTracking(TaskDetail taskDetail) {
		TaskDetailPage onTaskDetailPage = pageStore.get(TaskDetailPage.class);
		onTaskDetailPage.enterTimeTracking(taskDetail.getTimeTracking());
	}
	public void enterDueDate(TaskDetail taskDetail) {
		TaskDetailPage onTaskDetailPage = pageStore.get(TaskDetailPage.class);
		onTaskDetailPage.enterDueDateWith(taskDetail);
	}

	public void clickSaveTask() {
		TaskDetailPage onTaskDetailPage = pageStore.get(TaskDetailPage.class);
		onTaskDetailPage.clickSaveTask();
	}
/*
	public void changeStatusToStartWorking() {
		TaskDetailPage onTaskDetailPage = pageStore.get(TaskDetailPage.class);
		onTaskDetailPage.clickStartWorking();
	}

	public void changeStatusToComplete() {
		TaskDetailPage onTaskDetailPage = pageStore.get(TaskDetailPage.class);
		onTaskDetailPage.clickComplete();
	}*/

	public void clickSprint(DashboardDetail dashBoardDetail) {
		ProjectDashBoardPage onProjectDashBoardPagee = pageStore.get(ProjectDashBoardPage.class);
		onProjectDashBoardPagee.clickSprint(dashBoardDetail.getSprintDate());
	}

	/*public void enterStatus(TaskDetail taskDetail) {
		TaskDetailPage onTaskDetailPage = pageStore.get(TaskDetailPage.class);
		onTaskDetailPage.chooseStatus(taskDetail.getStatus());
	}*/
	public void chooseStatus(String status) {
		TaskDetailPage onTaskDetailPage = pageStore.get(TaskDetailPage.class);
		onTaskDetailPage.chooseStatus(status);
	}

	public void chooseTimeCode(String timeCode) {
		TaskDetailPage onTaskDetailPage = pageStore.get(TaskDetailPage.class);
		onTaskDetailPage.chooseTimeCode(timeCode);
	}

	public void chooseCurrentProject(DashboardDetail dashBoardDetail) {
		HomePage onHomePage = pageStore.get(HomePage.class);
		onHomePage.chooseProject(dashBoardDetail.getCurrentProject());
	}

	public void chooseTeam(DashboardDetail dashBoardDetail) {
		ProjectDashBoardPage onProjectDashBoardPagee = pageStore.get(ProjectDashBoardPage.class);
		onProjectDashBoardPagee.chooseTeam(dashBoardDetail.getTeam());
	}

}
