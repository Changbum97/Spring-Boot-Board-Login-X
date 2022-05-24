package Study.BoardNew.service;

import Study.BoardNew.domain.User;
import Study.BoardNew.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    /**
     * 회원가입
     */
    public Long join(User user) {
        validateDuplicateUser(user);
        userRepository.save(user);
        return user.getId();
    }
    private void validateDuplicateUser(User user) {
        List<User> findUsers = userRepository.findByNickname(user.getNickname());
        if(!findUsers.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 회원입니다!");
        }
    }

    /**
     * 회원 전체 조회
     */
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    /**
     * 회원 조회
     */
    public User findUser(Long userId) {
        return userRepository.findById(userId);
    }
}
