package course.impl;

import course.Group;
import course.api.Character;
import course.api.Presence;

import java.util.ArrayList;
import java.util.List;

public class PresenceImpl implements Presence {

    private Group group;
    private List<Staff> presentList;

    public PresenceImpl(Group group) {
        this.group = group;
    }

    @Override
    public boolean isPresent(Character character) {
        return presentList.contains(character);
    }

    @Override
    public void check() {
        presentList = new ArrayList<>();
        group.students()
                .forEach(it -> {
                    if (Math.random() > 0.3) presentList.add(it);
                });

        if (Math.random() > 0.5) {
            presentList.add(group.proffesor().get(0));
            presentList.add(group.proffesor().get(1));
        } else {
            presentList.add(group.proffesor().get(2));
            presentList.add(group.proffesor().get(3));
        }
    }
}
