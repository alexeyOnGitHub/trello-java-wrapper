package com.julienvey.trello;

import com.julienvey.trello.domain.*;

import java.util.List;

public interface Trello {

    /* Board */
    Board getBoard(String boardId, Argument... args);

    List<Action> getBoardActions(String boardId, Argument... args);

    List<Card> getBoardCards(String boardId, Argument... args);

    Card getBoardCard(String boardId, String cardId, Argument... args);

    List<CheckList> getBoardChecklists(String boardId, Argument... args);

    List<TList> getBoardLists(String boardId, Argument... args);

    List<Member> getBoardMembers(String boardId, Argument... args);

    List<Card> getBoardMemberCards(String boardId, String memberId, Argument... args);

    List<Member> getBoardMembersInvited(String boardId, Argument... args);

    Prefs getBoardMyPrefs(String boardId);

    Organization getBoardOrganization(String boardId, Argument... args);

    /////////////////

    Card createCard(String listId, Card card);

    void addLabelsToCard(String idCard, String[] labels);

    Member getBasicMemberInformation(String username);

}
